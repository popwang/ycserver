package com.ds.ycserver.mysql.mapper;

import com.ds.ycserver.mysql.model.EquipmentData;

/**
 * 状态数据操作mapper
 * 这个表中只有最新的一条数据
 * @author pactera
 *
 */
public interface Data2Mapper {
	/**
	 * 保存状态数据
	 * @param wp
	 */
	public void saveWpData2(EquipmentData wp);
	/**
	 * 删除状态数据
	 */
	public void deleteWpData2(EquipmentData wp);
}
