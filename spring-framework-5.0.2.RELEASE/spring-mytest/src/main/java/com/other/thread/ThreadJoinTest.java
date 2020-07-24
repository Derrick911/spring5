package com.other.thread;

import java.util.ArrayList;
import java.util.List;

public class ThreadJoinTest {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(() -> {
			System.out.println("线程一完成");
		});

		thread.start();
		thread.join();

		Thread thread1 = new Thread(() -> {
			System.out.println("线程二完成");
		});


		thread1.start();
		thread1.join();

		Thread thread2 = new Thread(() -> {
			try {
				Thread.sleep(1_000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("线程三完成");
		});

		thread2.start();
		thread2.join();
		System.out.println("main完成");
	}



}

