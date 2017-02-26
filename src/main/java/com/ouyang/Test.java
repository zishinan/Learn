package com.ouyang;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class Test {
	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("dddddddddddd");
			}
		});
		thread.start();
		int aaa = 19_999_999;
		System.out.println(aaa);
		
		switch ("ddd") {
		case "ddd":
			
			break;

		default:
			break;
		}
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("runffffffffffffffffff");
			}
		};
		
		Thread thread2 = new Thread(runnable);
		thread2.start();
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String abc = scanner.next();
			System.out.println(abc);
			if("exit".equals(abc)){
				break;
			}
		}
		
		ArrayList<E>
		scanner.close();
	}
}
