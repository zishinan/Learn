package com.test.ouyang.learn;
import java.lang.reflect.Constructor;

public class ClassLoaderTest {
	public static void main(String[] args) {
		Class c;
		ClassLoader cl,cl1;
		cl = ClassLoader.getSystemClassLoader();
		System.out.println(cl);
		while (null != cl) {
			cl1 = cl;
			cl = cl.getParent();
			System.out.println(cl1 + " 's parent is "+cl);
		}
		
		try {
			c = Class.forName("java.lang.Object");
			cl = c.getClassLoader();
			System.out.println("object "+ cl);
			
			c = Class.forName("ClassLoaderTest");
			cl = c.getClassLoader();
			System.err.println("ClassLoaderTest "+cl);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
