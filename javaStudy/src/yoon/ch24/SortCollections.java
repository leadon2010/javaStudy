package yoon.ch24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortCollections {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Weapon");
		list = new ArrayList<>(list);
		for (String str : list)
			System.out.println(str);
		System.out.println();
		Collections.sort(list);
		for (Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.println(itr.next());
	}
}
