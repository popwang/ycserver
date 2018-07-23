package com.ds.ycserver.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.ycserver.mysql.mapper.OrderBufferMapper;
import com.ds.ycserver.mysql.model.OrderBuffer;

@Service
public class OrderBufferService {
	@Autowired
	private OrderBufferMapper orderBufferMapper;
	
	public OrderBuffer selectOrderBufferByName(String name){
		OrderBuffer order = this.orderBufferMapper.selectOrderBufferByName(name);
		return order;
	}
	
	public void updateOrderBufferFlag(Integer i_id){
		this.orderBufferMapper.updateOrderBufferFlag(i_id);
	}
}
