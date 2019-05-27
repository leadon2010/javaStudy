package yoon.ch26;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}

}

public class SortComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("robot");
		list.add("apple");
		list.add("box");

		StrComp comp = new StrComp() {
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		};
		Collections.sort(list, comp);
		System.out.println(list);
	}
}
