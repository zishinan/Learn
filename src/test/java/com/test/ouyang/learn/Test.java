package com.test.ouyang.learn;

public class Test {
	public String name;
	public Test father;
	public static void main(String[] args) {
		Test test = new Test();
		test.name = "dddd";
		Test test1 = new Test();
		test.name = "dddd1";
		
		Test son = new Test();
		son.name = "son";
		son.father = test;
		test = test1;
		System.out.println(son.father.equals(test));
		System.out.println(son.father);
		System.out.println(test);
		System.out.println(test1);
		System.out.println(son.father.name);
	}
}
