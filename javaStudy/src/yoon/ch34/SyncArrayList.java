package yoon.ch34;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SyncArrayList {
	public static List<Integer> list = Collections.synchronizedList(new ArrayList<>());

	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 16; i++) {
			list.add(i);
		}
		System.out.println(list);
		Runnable task = () -> {
			synchronized (list) {
				ListIterator<Integer> itr = list.listIterator();
				while (itr.hasNext())
					itr.set(itr.next() + 1);
			}
		};
		ExecutorService exr = Executors.newFixedThreadPool(3);
		exr.submit(task);
		exr.submit(task);
		exr.submit(task);

		exr.shutdown();
		exr.awaitTermination(100, TimeUnit.SECONDS);
		System.out.println(list);
	}// end of main
}// end of class
