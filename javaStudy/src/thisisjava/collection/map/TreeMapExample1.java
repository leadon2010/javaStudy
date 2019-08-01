package thisisjava.collection.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample1 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "이동수");
		scores.put(new Integer(75), "박길순");
		scores.put(new Integer(95), "신용권");
		scores.put(new Integer(80), "김자바");

		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println("firstEntry => " + entry);
		entry = scores.lastEntry();
		System.out.println("lastEntry => " + entry);
		entry = scores.higherEntry(new Integer(95));
		System.out.println("higherEntry (95)=> " + entry);
		entry = scores.lowerEntry(new Integer(95));
		System.out.println("lowerEntry(95) => " + entry);
		entry = scores.ceilingEntry(new Integer(95));
		System.out.println("ceilingEntry(95) => " + entry);
		entry = scores.floorEntry(new Integer(80));
		System.out.println("floorEntry(80) => " + entry);
		while(!scores.isEmpty()) {
			System.out.println(scores.firstEntry() + ", remain Obj: " + scores.size());
			scores.pollFirstEntry();
		}
	}
}
