package com.ds.ycserver.mysql.mapper;

import com.ds.ycserver.mysql.model.EquipmentData;

/**
 * 状态数据操作mapper
 * @author pactera
 *
 */
public interface DataMapper {
	/**
	 * 保存状态数据
	 * @param wp
	 */
	public void saveWpData(EquipmentData wp);
}
