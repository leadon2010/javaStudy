package yoon.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class HashMapIteration {
	public static void main(String[] args) {
		// HashMap<Integer, String> map = new HashMap<>();
		TreeMap<Integer, String> map = new TreeMap<>();
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		Set<Integer> ks = map.keySet();

		for (Integer n : ks) {
			System.out.println(n + " " + map.get(n));
		}
		System.out.println();
		int keys;
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			keys = itr.next();
			System.out.println(keys + " " + map.get(keys));
		}

	}// end of main
}// end of class
