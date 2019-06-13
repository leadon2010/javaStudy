package collection.Map;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<Integer, String>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		System.out.println(scores);
		System.out.println();

		NavigableSet<Integer> navSet = scores.descendingKeySet();
		for (Integer key : navSet) {
			System.out.println(key + "- " + scores.get(key));
		}
		System.out.println();

		NavigableMap<Integer, String> descendMap = scores.descendingMap();
//		System.out.println("descendMap ===> " + descendMap);
		Set<Map.Entry<Integer, String>> descendSet = descendMap.entrySet();
//		System.out.println("descendSet ===> " + descendSet);
//		System.out.println();
		for (Map.Entry<Integer, String> entry : descendSet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "  ");
		}
		System.out.println();

		NavigableMap<Integer, String> ascendMap = descendMap.descendingMap();
		Set<Map.Entry<Integer, String>> ascendSet = ascendMap.entrySet();
		for (Map.Entry<Integer, String> entry : ascendSet) {
			System.out.print(entry.getKey() + "-" + entry.getValue() + "  ");
		}
		System.out.println();

	}
}
