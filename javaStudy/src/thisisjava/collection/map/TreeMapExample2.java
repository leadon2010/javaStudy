package thisisjava.collection.map;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		NavigableMap<Integer, String> descendingMap = scores.descendingMap();
		System.out.println("=================entrySet()==================");
		Set<Map.Entry<Integer, String>> entrySet = descendingMap.entrySet();
		Iterator<Map.Entry<Integer, String>> iter = entrySet.iterator();
		while (iter.hasNext()) {
			Map.Entry<Integer, String> mapEntry = iter.next();
			System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
		}
		System.out.println("=================keySet()==================");
		Set<Integer> keySet = scores.keySet();
		Iterator<Integer> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			Integer intValue = iterator.next();
			System.out.println(intValue + ",  " + scores.get(intValue));
		}
		System.out.println("=================descendingMap()==================");
		Set<Integer> desceingSet = descendingMap.keySet();
		Iterator<Integer> itr = desceingSet.iterator();
		while (itr.hasNext()) {
			Integer intValue = itr.next();
			System.out.println(intValue + ", " + descendingMap.get(intValue));
		}
	}
}
