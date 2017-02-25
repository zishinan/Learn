package com.test.ouyang;


public class Test {
	
	
	public static void main(String[] args) {
		int a = 1 << 3;
		Integer b = 1;
		System.out.println(a);
		System.out.println(a|20);
		System.out.println(a&20);
		
		Person person = new Person();
		person.setName("abc");
		Person person2 = new Person();
		person2.setName("a");
		change(a, b, person, person2);
		System.out.println(a);
		System.out.println(b);
		System.out.println(person.getName());
		System.out.println(person2.getName());
		
		
		
		
	}
	
	public static void change(int a,Integer b,Person person,Person person1){
		a = 3;
		b = 5;
		person.setName("hahah");
		person1 = new Person();
		person1.setName("ddddddd");
	}
}

class Person{
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}