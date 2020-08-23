package collections.tree;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample2 {
	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("apple");
		set.add("forever");
		set.add("description");
		set.add("ever");
		set.add("zoo");
		set.add("base");
		set.add("guess");
		set.add("cherry");

		System.out.println("==============<SortedSet>===============");
		SortedSet<String> sortedSet = set.headSet("c");
		sortedSet = set.tailSet("c");
		sortedSet = set.subSet("b", "f");
		for (String s : sortedSet) {
			System.out.println(s);
		}

		System.out.println("==============<NavigableSet>===============");
		NavigableSet<String> navigableSet = set.headSet("cherry", true);
		navigableSet = set.tailSet("cherry", false);
		navigableSet = set.subSet("cherry", true, "forever", true);
		for (String s : navigableSet) {
			System.out.println(s);
		}

	}
}
