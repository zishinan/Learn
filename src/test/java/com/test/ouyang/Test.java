package com.test.ouyang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

import com.ouyang.util.MapUtil;

public class Test {
	private static final int INTERVAL = 50000;
	public static void main(String[] args) {
		Set<Integer> numSet = new HashSet<>();
		Random random = new Random();
		for (int i = 0; i < 1000000; i++) {
			int num = random.nextInt(3000000);
			numSet.add(num);
		}
		
		Map<String, String> resultMap = new TreeMap<>();
		for (Integer num : numSet) {
			int tempNum = num / INTERVAL;
			int start = tempNum * (INTERVAL/10000);
			int end = (tempNum + 1) * (INTERVAL/10000);
			String key = start + "W--" + end+"W";
			MapUtil.mapIntIncrement(resultMap, key, 1);
		}
		
		List<Map<String, String>> result = new ArrayList<>();
		for (String key : resultMap.keySet()) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("interval", key);
			map.put("value", resultMap.get(key));
			result.add(map);
		}

		Collections.sort(result,new Comparator<Map<String, String>>() {
			@Override
			public int compare(Map<String, String> o1, Map<String, String> o2) {
				int n1 = Integer.parseInt(o1.get("interval").split("W--")[0]);
				int n2 = Integer.parseInt(o2.get("interval").split("W--")[0]);
				return n1 - n2;
			}
		});
		for (Map<String, String> map : result) {
			System.out.println(MapUtil.getMapString(map, "interval")+"\t"+MapUtil.getMapString(map, "value"));
		}
		
	}
}
