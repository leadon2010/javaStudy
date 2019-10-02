package com.yedam.collections.tree;

import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer, String> scores = new TreeMap<>();
		scores.put(new Integer(87), "홍길동");
		scores.put(new Integer(98), "김길동");
		scores.put(new Integer(75), "이길동");
		scores.put(new Integer(95), "최길동");
		scores.put(new Integer(80), "박길동");

		Map.Entry<Integer, String> entry = null;
		entry = scores.firstEntry();
		System.out.println(entry.getKey() + "," + entry.getValue());
		entry = scores.lastEntry();
		System.out.println(entry.getKey() + "," + entry.getValue());
		entry = scores.ceilingEntry(90);
		System.out.println(entry.getKey() + "," + entry.getValue());
		entry = scores.floorEntry(90);
		System.out.println(entry.getKey() + "," + entry.getValue());

		System.out.println("=============================");
		NavigableMap<Integer, String> nmap = scores.descendingMap();
		System.out.println("keySet===========");
		Set<Integer> keySet = nmap.keySet();
		for (Integer key : keySet) {
			System.out.println(key + ", " + nmap.get(key));
		}
		System.out.println("EntrySet==========");
		Set<Entry<Integer, String>> entrySet = nmap.entrySet();
		for (Entry<Integer, String> ent : entrySet) {
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}
		System.out.println("end of program.");
	}
}
