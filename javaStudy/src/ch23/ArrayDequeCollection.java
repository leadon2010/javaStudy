package ch23;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeCollection {
	public static void main(String[] args) {
		Deque<String> q = new ArrayDeque<>();
		q.offerFirst("1.Box");
		q.offerFirst("2.Toy");
		q.offerFirst("3.Robot");
		System.out.println(q.pollLast());
		System.out.println(q.pollLast());
		System.out.println(q.pollLast());
	}
}
