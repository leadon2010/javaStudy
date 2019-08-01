package thisisjava.collection.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");
		System.out.println("[search c ~ f]");
		NavigableSet<String> navigableSet = treeSet.subSet("c", true, "f", true);
		for (String str : navigableSet) {
			System.out.println(str);
		}

	}
}
