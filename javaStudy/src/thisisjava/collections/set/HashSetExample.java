package thisisjava.collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet");
		set.add("Java");
		set.add("iBatis");

		int size = set.size();
		System.out.println("객체수: " + size);
		System.out.println();

		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String elem = iterator.next();
			System.out.println(elem);
		}

		set.remove("Java");
		System.out.println();
		for (String str : set) {
			System.out.println(str);
		}
		System.out.println();

		set.clear();
		if (set.isEmpty())
			System.out.println("비어있음.");
	}
}
