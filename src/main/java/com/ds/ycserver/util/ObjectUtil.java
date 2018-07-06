package com.ds.ycserver.util;

import com.ds.ycserver.mysql.model.EquipmentData;

public class ObjectUtil {
	public static EquipmentData stringToObject(String[] strs){
		EquipmentData wp = new EquipmentData();
		wp.setV_equipment_name(strs[2]);
		wp.setP001(Double.parseDouble(strs[3]));
		wp.setP002(Double.parseDouble(strs[4]));
		wp.setP003(Double.parseDouble(strs[5]));
		wp.setP004(Double.parseDouble(strs[6]));
		wp.setP005(Double.parseDouble(strs[7]));
		wp.setP006(Double.parseDouble(strs[8]));
		wp.setP007(Double.parseDouble(strs[9]));
		wp.setP008(Double.parseDouble(strs[10]));
		wp.setP009(Double.parseDouble(strs[11]));
		wp.setP010(Double.parseDouble(strs[12]));
		wp.setP011(Double.parseDouble(strs[13]));
		wp.setP012(Double.parseDouble(strs[14]));
		wp.setP013(Double.parseDouble(strs[15]));
		wp.setP014(Double.parseDouble(strs[16]));
		wp.setP015(Double.parseDouble(strs[17]));
		//新增扩展字段
		if(strs.length==34){
			wp.setP016(Double.parseDouble(strs[18]));
			wp.setP017(Double.parseDouble(strs[19]));
			wp.setP018(Double.parseDouble(strs[20]));
			wp.setP019(Double.parseDouble(strs[21]));
			wp.setP020(Double.parseDouble(strs[22]));
			wp.setP021(Double.parseDouble(strs[23]));
			wp.setP022(Double.parseDouble(strs[24]));
			wp.setP023(Double.parseDouble(strs[25]));
			wp.setP024(Double.parseDouble(strs[26]));
			wp.setP025(Double.parseDouble(strs[27]));
			wp.setP026(Double.parseDouble(strs[28]));
			wp.setP027(Double.parseDouble(strs[29]));
			wp.setP028(Double.parseDouble(strs[30]));
			wp.setP029(Double.parseDouble(strs[31]));
			wp.setP030(Double.parseDouble(strs[32]));
		}
		return wp;
	}
	
	public static void main(String[] args) {
		String s = "SEND,DATAS,00000044,11,1111111111,11223344556677889900,11223344556677889900,,,,,,,,,30.811207,111.294708,END";
		String strs[] = s.split(",");
		for(int i=0;i<strs.length;i++){
			System.out.println("第"+i+"个元素："+strs[i]);
		}
	}
}
