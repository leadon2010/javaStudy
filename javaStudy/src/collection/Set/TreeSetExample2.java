package collection.Set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		for (Integer i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("[오름차순 iterator() ]");
		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		System.out.println("[내림차순 iterator() ]");
		iter = scores.descendingIterator();
		while (iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();

		System.out.println("[내림차순 descendingSet() ]");
		NavigableSet<Integer> descendingSet = scores.descendingSet();
//		System.out.println("[Set]" + descendingSet);
		for (Integer score : descendingSet) {
			System.out.print(score + " ");
		}
		System.out.println();

		System.out.println("[오름차순 descendingSet().descendingSet()]");
		NavigableSet<Integer> ascendingSet = scores.descendingSet().descendingSet();
		for (Integer score : ascendingSet) {
			System.out.print(score + " ");
		}
	}
}
