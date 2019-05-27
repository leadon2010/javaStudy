package yoon.ch34;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo2 {
	public static void main(String[] args) {
		Runnable task1 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (5 + 7));
		};
		Runnable task2 = () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (7 - 5));
		};
		ExecutorService exr = Executors.newFixedThreadPool(2);
		exr.submit(task1, "first");
		exr.submit(task2, "second");
		exr.submit(() -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " " + (7 * 5));
		});
		exr.shutdown();
	}// end of main
}// end of class
