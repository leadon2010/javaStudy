package collections.tree;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		System.out.println("==========================================================");
		SortedMap<Integer, String> sMap = scores.headMap(new Integer(80));
		sMap = scores.tailMap(new Integer(80));
		sMap = scores.subMap(new Integer(80), new Integer(90));
		Set<Map.Entry<Integer, String>> set = sMap.entrySet();
		for (Map.Entry<Integer, String> entry : set) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}

		System.out.println("==========================================================");
		NavigableMap<Integer, String> nMap = scores.headMap(new Integer(80), true);
		nMap = scores.tailMap(new Integer(80), true);
		nMap = scores.subMap(new Integer(80), true, new Integer(90), true);
		Set<Map.Entry<Integer, String>> nSet = nMap.entrySet();
		for (Map.Entry<Integer, String> entry : nSet) {
			System.out.println("key: " + entry.getKey() + ", value: " + entry.getValue());
		}
	}
}
