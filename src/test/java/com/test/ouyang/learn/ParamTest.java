package com.test.ouyang.learn;

public class ParamTest {
	public int memberVariable = 0;
	public static void main(String[] args) {
		int param1 = 0;
		ParamTest param2 = new ParamTest();
		ParamTest param3 = new ParamTest();
		int[] param4 = {0};
		changeParam(param1, param2, param3, param4);
		
		System.out.println(param1);
		System.out.println(param2.memberVariable);
		System.out.println(param3.memberVariable);
		System.out.println(param4[0]);
	}
	
	public static void changeParam(int param1,ParamTest param2,ParamTest param3,int[] param4) {
		param1 = 1;
		param2.memberVariable = 1;
		param3 = new ParamTest();
		param3.memberVariable = 1;
		param4[0] = 1;
	}
}
