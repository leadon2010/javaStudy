package thisisjava.collections.tree;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		NavigableSet<Integer> descSet = scores.descendingSet();
		Iterator<Integer> iter = descSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		for (Integer score : descSet) {
			System.out.println(score);
		}

	}
}