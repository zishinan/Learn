package com.test.ouyang;

public class TestConstructor {
	public static void main(String[] args) {
		new C();
	}
}

class A{
	static{
		System.out.println("s A");
	}
	
	{
		System.out.println("code A");
	}
	
	public A() {
		System.out.println("cons A");
	}
}
class B extends A{
	static{
		System.out.println("s B");
	}
	
	{
		System.out.println("code B");
	}
	
	public B() {
		System.out.println("cons B");
	}
}
class C extends B{
	static{
		System.out.println("s C");
	}
	
	{
		System.out.println("code C");
	}
	
	public C() {
		System.out.println("cons C");
	}
}