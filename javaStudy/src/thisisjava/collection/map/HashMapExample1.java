package thisisjava.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		System.out.println("Total Entry : " + map.size());
		System.out.println("==========keySet()============");
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while (iterator.hasNext()) {
			String itr = iterator.next();
			System.out.println(itr + " " + map.get(itr));
		}
		System.out.println("==========entrySet()============");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iterMap = entrySet.iterator();
		while (iterMap.hasNext()) {
			Map.Entry<String, Integer> mapEntry = iterMap.next();
			System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
		}
	}
}
