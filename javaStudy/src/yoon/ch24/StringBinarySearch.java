package yoon.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringBinarySearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Box");
		list.add("Robot");
		list.add("Apple");
		Collections.sort(list);
		int idx = Collections.binarySearch(list, "Robot");
		System.out.println(idx + " " + list.get(idx));
		int ind = 0;
		for (String bi : list) {
			ind = Collections.binarySearch(list, bi);
			System.out.println(bi + " " + ind);
		}
	}
}
