package thisisjava.collection.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/*
 * descendingSet -> NavigableSet 사용방법 
 */
public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(new Integer(80));

		NavigableSet<Integer> descendingSet = scores.descendingSet();
		for (Integer intValue : descendingSet) {
			System.out.println(intValue);
		}
		System.out.println("===================================");

		NavigableSet<Integer> ascendingSet = descendingSet.descendingSet();
		for (Integer intValue : ascendingSet) {
			System.out.println(intValue);
		}
		System.out.println("===================================");

		Iterator<Integer> iterator = ascendingSet.descendingIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
