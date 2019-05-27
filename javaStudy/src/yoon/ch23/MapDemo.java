package yoon.ch23;

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

		Set<String> set = map.keySet();
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			String keys = itr.next();
			System.out.println(keys + " ==> " + map.get(keys));
		}
		System.out.println();

		iteratorUsingForEach(map);
		System.out.println();
		iteratorUsingIterator2(map);

	}// end of main

	static void iteratorUsingForEach(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		for (Map.Entry<String, Integer> entry : set) {
			System.out.println(entry.getKey() + " ==> " + entry.getValue());
		}
	}

	static void iteratorUsingIterator(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		for (Iterator<Map.Entry<String, Integer>> itr = set.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
	}

	static void iteratorUsingIterator2(HashMap<String, Integer> map) {
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		System.out.println(set);
		Iterator<Map.Entry<String, Integer>> itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> ent = itr.next();
			System.out.println(ent.getKey() + " --> " + ent.getValue());
		}
	}

}// end of class
