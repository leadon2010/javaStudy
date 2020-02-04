package thisisjava.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();

		long startTime, endTime;
		System.out.println("type:1");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
//			System.out.println(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime) + " ns");

		System.out.println("type:2");
		startTime = System.nanoTime();
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
//			System.out.println(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime) + " ns");
	}
}