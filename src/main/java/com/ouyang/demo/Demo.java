package com.ouyang.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import com.ouyang.util.collection.MapUtil;

public class Demo {
	public static void main(String[] args) {
		String[] name = new String[]{"赵伟伟","阳熙","李瑶","王诗中","兰云梁"};
		
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < 1000; i++) {
			int ranInt = new Random().nextInt(name.length);
			String nameString = name[ranInt];
			MapUtil.mapIntIncrement(map, nameString, 1);
			System.out.println(nameString + "打扫卫生！");
		}
		
		System.out.println(map.toString());
	}
}
