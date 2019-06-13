package com.yedam.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

}

public class Second {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("apple");
		list.add("box");
		StrComp cmp = new StrComp();
		Collections.sort(list, cmp);
		System.out.println(list);
//		Collections.sort(list, (String s1, String s2) -> {
//			return s1.length() - s2.length();
//		});
	}
}
