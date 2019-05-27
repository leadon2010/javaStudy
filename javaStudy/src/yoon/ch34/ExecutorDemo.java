package yoon.ch34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	public static void main(String[] args) {
		Runnable task = () -> {
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (n1 + n2));
		};
		ExecutorService exr = Executors.newSingleThreadExecutor();
		exr.submit(task);
		System.out.println("end : " + Thread.currentThread().getName());
		exr.shutdown();
	}// end of main
}// end of class
