package thisisjava.collection.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample1 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Iterator<Integer> iterator = scores.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		Integer score = null;
		score = scores.first();
		System.out.println("first() => " + score);
		score = scores.last();
		System.out.println("last() => " + score);
		score = scores.lower(95);
		System.out.println("lower(95) => " + score);
		score = scores.higher(95);
		System.out.println("higher(95) => " + score);
		score = scores.ceiling(80);
		System.out.println("ceiling(80) => " + score);
		score = scores.floor(87);
		System.out.println("floor(87) => " + score);

		while (!scores.isEmpty()) {
			System.out.println("남은 객수 : " + scores.size() + ", first() =>  " + scores.first());
			scores.pollFirst();
		}

	}
}
