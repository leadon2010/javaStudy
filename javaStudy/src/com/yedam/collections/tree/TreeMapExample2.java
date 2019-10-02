package com.yedam.collections.tree;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample2 {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "김길동");
		scores.put(new Integer(75), "이길동");
		scores.put(new Integer(95), "최길동");
		scores.put(new Integer(80), "박길동");

		NavigableMap<Integer, String> descMap = scores.descendingMap();
//		Set<Integer> keySet = descMap.descendingKeySet();
		Set<Map.Entry<Integer, String>> entrySet = descMap.entrySet();
		for (Map.Entry<Integer, String> mapEntry : entrySet) {
			System.out.println(mapEntry.getKey() + ", " + mapEntry.getValue());
		}
		System.out.println();
		descMap.forEach((a, b) -> {
			System.out.println(a + ", " + b);
		});

	}
}
