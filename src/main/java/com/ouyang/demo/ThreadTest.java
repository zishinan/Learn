package com.ouyang.demo;

public class ThreadTest extends Thread {
	int i;
	public static void main(String[] args) {
		ThreadTest test = new ThreadTest();
		test.setName("test");
		test.start();
		ThreadTest test1 = new ThreadTest();
		test1.setName("tset1");
		test1.start();
		
		test.run();
		test1.run();
	}
	
	@Override
	public void run() {
		for ( i = 0; i < 100; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(currentThread().getName()+" "+i);
		}
	}
}
