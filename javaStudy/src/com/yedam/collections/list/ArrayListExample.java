package com.yedam.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet");
		list.add(2, "Database");
		list.add("iBatis");
		int size = list.size();
		System.out.println("총객체수: " + size);
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println();
		String str = list.get(2);
		System.out.println("2: " + str);
		System.out.println();
		String newStr = list.set(0, "Java2");
		System.out.println("newStr : " + newStr);
		System.out.println();
		String dataBase = list.remove(2);
		System.out.println("removed: " + dataBase);
		System.out.println();
		for (String str2 : list) {
			System.out.println(str2);
		}
	}
}
