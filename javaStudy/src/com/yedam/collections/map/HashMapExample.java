package com.yedam.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("홍길동", 80);
		map.put("이길동", 70);
		map.put("김길동", 80);
		map.put("홍길동", 90);
		System.out.println("Entry 갯수: " + map.size());
		System.out.println("홍길동  의 점수: " + map.get("홍길동"));

		System.out.println("방법: I");
		Set<String> keyset = map.keySet();
		Iterator<String> iter = keyset.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Integer value = map.get(key);
			System.out.println(key + "의 값은 " + value);
		}
		System.out.println();
		Integer intVal = map.remove("홍길동");
		System.out.println(intVal);
		System.out.println();

		System.out.println("방법: II");
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> iter2 = entrySet.iterator();
		while (iter2.hasNext()) {
			Map.Entry<String, Integer> entry = iter2.next();
			System.out.println(entry.getKey() + "의 값은 " + entry.getValue());
		}
		System.out.println();
		System.out.println("방법: III");
		for (Map.Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}
		System.out.println();
		System.out.println("방법: IV");
		map.forEach((a, b) -> {
			System.out.println(a + ", " + b);
		});
	}
}
