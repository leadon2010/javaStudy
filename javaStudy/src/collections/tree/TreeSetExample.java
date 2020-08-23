package collections.tree;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		Integer score = null;
		score = scores.first();
		score = scores.last();
		score = scores.lower(new Integer(80));
		score = scores.higher(new Integer(95));
		score = scores.ceiling(new Integer(81));
		score = scores.floor(new Integer(80));
//		System.out.println(score);

		// 정렬관련 메소드
		NavigableSet<Integer> set = scores.descendingSet(); // 내림차순정렬.
		for (Integer s : set) {
//			System.out.println(s);
		}

		NavigableSet<Integer> ascSet = set.descendingSet();
		for (Integer s : ascSet) {
			System.out.println(s);
		}

	}
}
