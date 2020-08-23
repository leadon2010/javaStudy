package collections.tree;

import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		entry = scores.lastEntry();
		entry = scores.lowerEntry(new Integer(80));
		entry = scores.higherEntry(new Integer(80));
		entry = scores.floorEntry(new Integer(80));
		entry = scores.ceilingEntry(new Integer(95));

//		System.out.println("점수: " + entry.getKey() + ", 이름: " + entry.getValue());

		while (!scores.isEmpty()) {
//			entry = scores.pollFirstEntry();
			entry = scores.pollLastEntry();
			System.out.println("점수: " + entry.getKey() + ", 이름: " + entry.getValue() + ", 남은 객체: " + scores.size());
		}

		NavigableSet<Integer> set = scores.descendingKeySet();
		for (Integer icnt : set) {
			System.out.println("key: " + icnt + ", value: " + scores.get(icnt));
		}

		NavigableMap<Integer, String> map = scores.descendingMap();
		Set<Integer> keySet = map.keySet();
		for (Integer icnt : keySet) {
			System.out.println("key: " + icnt + ", value: " + scores.get(icnt));
		}

	}
}
