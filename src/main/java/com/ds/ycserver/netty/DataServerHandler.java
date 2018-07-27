package com.ds.ycserver.netty;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.io.UnsupportedEncodingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ds.ycserver.mysql.model.EquipmentData;
import com.ds.ycserver.mysql.model.OrderBuffer;
import com.ds.ycserver.mysql.service.DataService;
import com.ds.ycserver.mysql.service.DataService2;
import com.ds.ycserver.mysql.service.OrderBufferService;
import com.ds.ycserver.util.ObjectUtil;

@Component
@Scope("prototype")
public class DataServerHandler extends ChannelInboundHandlerAdapter {
	private static Logger logger = LoggerFactory.getLogger(DataServerHandler.class);

	@Autowired
	private DataService2 dataService2;
	@Autowired
	private DataService dataService;
	@Autowired
	private OrderBufferService orderBufferService;

	@Override
	public void channelActive(ChannelHandlerContext ctx) throws Exception {
		super.channelActive(ctx);
		logger.info(ctx.channel().remoteAddress().toString() + " 客户端连接成功!");
	}

	@Override
	public void channelUnregistered(ChannelHandlerContext ctx) throws Exception {
		super.channelUnregistered(ctx);
		logger.info(ctx.channel().remoteAddress().toString() + " 客户端断开连接！");
	}

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		String str = ((String) msg).trim();
		str += ",END";
		if (str != null && !"".equals(str)) {
			logger.info(ctx.channel().remoteAddress().toString() + ":" + str);
			/**
			 * 以SEND开头为有效数据
			 */
			if (str.startsWith("SEND") && str.endsWith("END")) {
				String[] strs = str.split(",");
				/**
				 * 数据格式正确，解析入库
				 */
				if (strs.length == 19 || strs.length==34) {
					EquipmentData wp = ObjectUtil.stringToObject(strs);
					//数据合格才做更新，否则不予更新
					if(wp.getP002()>0 || wp.getP003()>0){
						dataService2.saveWpData2(wp);
					}
					dataService.saveWpData(wp);
				}
				/**
				 * 查询有没有待发送的指令
				 */
				OrderBuffer order = orderBufferService.selectOrderBufferByName(strs[2]);
				if(order!=null){
					System.out.println();
					ByteBuf buf = Unpooled
							.copiedBuffer(new String(order.getV_order_content().getBytes("utf-8"), "GBK").getBytes());
					ctx.write(buf);
					orderBufferService.updateOrderBufferFlag(order.getI_id());
					logger.error("设备编号为：" + order.getV_equipment_name() + "的第" + order.getI_id() + "号指令已发送成功！");
				}
			}
		} else {
			logger.info("没有数据...");
		}
	}

	@Override
	public void handlerRemoved(ChannelHandlerContext ctx) throws Exception {
		super.handlerRemoved(ctx);
		logger.info(ctx.channel().remoteAddress().toString() + "连接已移除！");
	}

	@Override
	public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
		ctx.flush();
	}

	@Override
	public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
		cause.printStackTrace();
		ctx.close();
		logger.info(ctx.channel().remoteAddress().toString() + "连接已关闭！");
	}

	public String getMessage(ByteBuf buf) {
		byte[] con = new byte[buf.readableBytes()];
		buf.readBytes(con);
		try {
			return new String(con, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return null;
		}
	}
}
