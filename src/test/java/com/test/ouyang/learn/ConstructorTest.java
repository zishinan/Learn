package com.test.ouyang.learn;
public class ConstructorTest {
	public static void main(String args[]) {
		ConstructorTest constructorTest = new ConstructorTest();
	}
	private ConstructorTest() {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
}
