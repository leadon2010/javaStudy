package yoon.ch23;

import java.util.Comparator;
import java.util.TreeSet;

class ComparatorString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

}

class OriginString implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
		// return 0;
	}

}

public class ComparatorStinrg {
	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<>(new ComparatorString());
		ts.add("abc");
		ts.add("dddd");
		ts.add("aaaadddd");
		for (String s : ts)
			System.out.println(s);

	}
}
