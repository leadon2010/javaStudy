package com.yedam.collections.tree;

import java.util.Map;
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
		
	}
}
