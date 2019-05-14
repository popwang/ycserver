package com.ds.ycserver.util;

import java.io.IOException;

import com.ds.ycserver.mysql.model.EquipmentData;

public class ObjectUtil {
	public static EquipmentData stringToObject(String[] strs) {
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
		return wp;
	}

	public static void handler() {
		System.out.println("1====...");
		String cmd = "cmd /c start D:\\ads\\Java\\jdk1.8.0_131\\bin\\init.bat";
		try {
			Process ps = Runtime.getRuntime().exec(cmd);
			System.out.println(ps.getInputStream());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("1====!");
	}
	
	public static void handler2() {
		System.out.println("2====...");
		String cmd = "cmd /c start D:\\ads\\Java\\jdk1.8.0_131\\bin\\init2.bat";
		try {
			Process ps = Runtime.getRuntime().exec(cmd);
			System.out.println(ps.getInputStream());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("2====!");
	}

	public static void main(String[] args) {
//		String s = "SEND,DATAS,00000044,11,1111111111,11223344556677889900,11223344556677889900,,,,,,,,,30.811207,111.294708,END";
//		String strs[] = s.split(",");
//		for(int i=0;i<strs.length;i++){
//			System.out.println("第"+i+"个元素："+strs[i]);
//		}
		handler();
	}
}
