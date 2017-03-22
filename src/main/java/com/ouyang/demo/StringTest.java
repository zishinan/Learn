package com.ouyang.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class StringTest {
	public static void main(String[] args) {
		int[] zhongjiang = {7,8,12,13,22,30,9};
		long n = 0;
		int res1 = 0;
		int res2 = 0;
		int res3 = 0;
		while (n < 188000000) {
			n++;
			ArrayList<Integer> result = getResult();
			int[] res = yidengjiang(zhongjiang, result);
			if(res[0] == 6 && res[1] == 1){
				System.out.println("第"+n+"次开奖中一等奖了，500万！："+result+"  一等奖总次数："+(++res1) +"  二等奖总次数："+(res2) + "  三等奖总次数："+res3);
			}else if(res[0] == 6) {
				System.out.println("第"+n+"次开奖中二等奖了，20万！："+result+"  一等奖总次数："+(res1)+"  二等奖总次数："+(++res2) + "  三等奖总次数："+res3);
			}else if(res[0] == 5 && res[1] == 1) {
				System.out.println("第"+n+"次开奖中三等奖了，3000！："+result+"  一等奖总次数："+(res1)+"  二等奖总次数："+(res2)+"  三等奖总次数："+(++res3));
			}
		}
	}

	private static int[] yidengjiang(int[] zhongjiang, ArrayList<Integer> result) {
		int count = 0;
		for (int i = 0; i < zhongjiang.length - 1; i++) {
			if(zhongjiang[i] == result.get(i)){
				count++;
			}
		}
		int[] res = new int[2];
		res[0] = count;
		if(zhongjiang[6] == result.get(6)){
			res[1] = 1;
		}
		return res;
	}
	
	public static ArrayList<Integer> getResult(){
		ArrayList<Integer> result = new ArrayList<>();
		int n = 0;
		while (true) {
			int temp = new Random().nextInt(33)+1;
			if(result.contains(temp)){
				continue;
			}
			result.add(temp);
			n++;
			if(n == 6){
				break;
			}
		}
		
		result.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		
		int blue = new Random().nextInt(15)+1;
		result.add(blue);
		return result;
	}
}
