package com.ouyang.concurrency;

/**
 * 《Java并发编程的艺术》
 * 2
 * @author <a href="xi.yang@i-jia.net">yangxi</a>
 */
public class DeadLockDemo {
	private static String A = "a";
	private static String B = "b";
	public static void main(String[] args) {
		new DeadLockDemo().dealLock();
	}
	
	private void dealLock(){
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (A) {
					try {
						Thread.currentThread().sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (B) {
						System.out.println(1);
					}
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				synchronized (B) {
					synchronized (A) {
						System.out.println(2);
					}
				}
			}
		});
		
		t1.start();
		t2.start();
	}
}
