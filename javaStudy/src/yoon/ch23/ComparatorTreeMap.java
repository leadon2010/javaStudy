package yoon.ch23;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

class AgeComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2.intValue() - o1.intValue();
	}

}

public class ComparatorTreeMap {
	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<>(new AgeComparator());
		map.put(45, "Brown");
		map.put(37, "James");
		map.put(23, "Martin");

		Set<Integer> ks = map.keySet();
		for (Integer n : ks) {
			System.out.println(n + " " + map.get(n));
		}
		System.out.println();
		int keys;
		for (Iterator<Integer> itr = ks.iterator(); itr.hasNext();) {
			keys = itr.next();
			System.out.println(keys + " " + map.get(keys));
		}
	}
}
