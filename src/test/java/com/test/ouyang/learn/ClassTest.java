package com.test.ouyang.learn;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

public class ClassTest {
	public static void main(String[] args) {
		new ClassB(3);
		SoftReference<ClassA> softReference = new SoftReference<ClassA>(new ClassA());
		WeakReference<ClassB> weakReference = new WeakReference<ClassB>(new ClassB(3));
		ReferenceQueue<ClassC> referenceQueue = new ReferenceQueue<>();
		PhantomReference<ClassC> phantomReference = new PhantomReference<ClassC>(new ClassC(3), referenceQueue);
	}
}

class ClassA{
	public ClassA() {
		System.out.println("this is class a");
	}
}

class ClassB extends ClassA{
	public ClassB(int a) {
		System.out.println("this is class b");
	}
}

class ClassC extends ClassB{
	public ClassC(int a) {
		super(a);
		System.out.println("this is class c");
	}
}