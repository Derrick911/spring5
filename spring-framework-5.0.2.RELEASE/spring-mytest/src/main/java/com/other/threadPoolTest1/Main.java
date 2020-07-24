package com.other.threadPoolTest1;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public class Main {

	public static void main(String[] args) {
		/*AsyncProcessQueue.execute(new Runnable() {
			@Override
			public void run() {
				System.out.println("线程" + Thread.currentThread().getName() + ",正在执行");

				try {
					Thread.sleep(2_000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("线程" + Thread.currentThread().getName() + ",执行结束");
			}
		});*/
		Map<String, String> map = new HashMap<>();
		String c = "";

		try{
			c = map.get("a");
		}catch (Exception e) {
			System.out.println("1");

			System.out.println(map);
		} finally {
			System.out.println("2");
			System.out.println(c);
		}
	}
}
