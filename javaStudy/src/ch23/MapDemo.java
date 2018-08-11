package ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();
		map.put("a", 10);
		map.put("b", 20);
		map.put("c", 30);

		iteratorUsingForEach(map);
		System.out.println();
		iteratorUsingIterator2(map);

	}// end of main

	static void iteratorUsingForEach(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for (Map.Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
	}

	static void iteratorUsingIterator(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();

		for (Iterator<Map.Entry<String, Integer>> itr = entries.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}

	static void iteratorUsingIterator2(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		System.out.println(entries);
		Iterator<Map.Entry<String, Integer>> itr = entries.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> ent = itr.next();
			System.out.println(ent.getKey() + " --> " + ent.getValue());
		}
	}

}// end of class
