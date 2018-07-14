package ch27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SLenComp implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

}

public class SLenComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("STEO");
		list.add("TOM");
		list.add("NE");
		Collections.sort(list, new SLenComp());

		for (String s : list)
			System.out.println(s);
	}

}
