package com.ds.ycserver.mysql.mapper;

import org.apache.ibatis.annotations.Param;

import com.ds.ycserver.mysql.model.OrderBuffer;
/**
 * 指令缓存表
 * @author pactera
 *
 */
public interface OrderBufferMapper {
	/**
	 * 查询设备最新的待发送指令
	 * @param name
	 * @return
	 */
	public OrderBuffer selectOrderBufferByName(@Param("v_equipment_name") String name);
	/**
	 * 指令发送成功后执行指令计数器+1
	 * @param name
	 */
	public void updateOrderBufferFlag(@Param("i_id") Integer i_id);
}
