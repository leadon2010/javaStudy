package thisisjava.collection.Map;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("apple");
		treeSet.add("forever");
		treeSet.add("description");
		treeSet.add("ever");
		treeSet.add("zoo");
		treeSet.add("base");
		treeSet.add("guess");
		treeSet.add("cherry");

		System.out.println("[headSet  검색]");
		NavigableSet<String> headSet = treeSet.headSet("e", true);
		for (String str : headSet) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("[tailSet  검색]");
		NavigableSet<String> tailSet = treeSet.tailSet("e", true);
		for (String str : tailSet) {
			System.out.println(str);
		}
		System.out.println();

		System.out.println("[c~f 사이의 단어 검색]");
		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
		for (String word : rangeSet) {
			System.out.println(word);
		}

	}
}
