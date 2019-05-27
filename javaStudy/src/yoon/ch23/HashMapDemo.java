package yoon.ch23;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<>();
		map.put("a", new Double(1.1));
		map.put("b", new Double(2.1));
		map.put("c", new Double(3.1));
		map.put("d", new Double(4.1));
		map.put("e", new Double(5.1));

		// Set<?> set = map.entrySet();
		Set<String> set = map.keySet();
		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			String keys = (String) itr.next();
			System.out.println(keys + " == " + map.get(keys));
		}

	}// end of main
}// end of class
