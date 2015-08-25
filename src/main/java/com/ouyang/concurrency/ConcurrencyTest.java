package com.ouyang.concurrency;

import java.util.concurrent.atomic.AtomicLong;


/**
 * 《Java并发编程的艺术》
 * 1
 * Lmbench3测量上下文切换带来的消耗
 * vmstat测量上下文切换的次数
 * 
 * 减少上下文切换的方法：无锁并发编程、CAS算法（Atomic）、使用最少的线程、使用协程。
 * @author <a href="xi.yang@i-jia.net">yangxi</a>
 */
public class ConcurrencyTest {
	private static final long count = 10000;
	
	public static void main(String[] args) {
		try {
			concurrency();
			serial();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void concurrency() throws InterruptedException{
		long start = System.currentTimeMillis();
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int a = 0;
				for (int i = 0; i < count; i++) {
					a += 5;
				}
			}
		});
		thread.start();
		int b = 0;
		for (int i = 0; i < count; i++) {
			b--;
		}
		long end = System.currentTimeMillis();
		thread.join();
		System.out.println("concurrency time is "+(end - start));
		
	}
	
	public static void serial(){
		long start = System.currentTimeMillis();
		int a = 0;
		for (int i = 0; i < count; i++) {
			a += 5;
		}
		int b = 0;
		for (int i = 0; i < count; i++) {
			b--;
		}
		long end = System.currentTimeMillis();
		System.out.println("serial time is "+(end - start));
	}
	
	public void atomicTest(){
		AtomicLong atomicLong = new AtomicLong(10000);
	}
}
