package yoon.ch24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StrComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// return o1.compareToIgnoreCase(o2);
		return o1.compareTo(o2);
	}

}

public class StringComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Apple");
		list.add("Box");
		StrComp cmp = new StrComp();
		Collections.sort(list, cmp);
		int idx = Collections.binarySearch(list, "Robot", cmp);
		System.out.println(list.get(idx) + "[" + idx + "]");
	}// end of main
}// end of class
