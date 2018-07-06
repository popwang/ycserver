package com.ds.ycserver.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ds.ycserver.mysql.mapper.Data2Mapper;
import com.ds.ycserver.mysql.model.EquipmentData;

@Service
public class DataService2 {
	@Autowired
	private Data2Mapper data2Mapper;
	/**
	 * 启用事务，先删除后插入，保持表中只有一条最新数据
	 * @param wp
	 */
	@Transactional
	public void saveWpData2(EquipmentData wp){
		data2Mapper.deleteWpData2(wp);
		data2Mapper.saveWpData2(wp);
	}
}
