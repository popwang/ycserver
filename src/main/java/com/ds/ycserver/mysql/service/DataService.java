package com.ds.ycserver.mysql.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ds.ycserver.mysql.mapper.DataMapper;
import com.ds.ycserver.mysql.model.EquipmentData;

@Service
public class DataService {
	@Autowired
	private DataMapper dataMapper;
	
	public void saveWpData(EquipmentData wp){
		dataMapper.saveWpData(wp);
	}
}
