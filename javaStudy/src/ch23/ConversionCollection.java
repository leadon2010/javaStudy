package ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ConversionCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("boy", "toy", "plastic", "boy");
		list = new ArrayList<>(list);

		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();

		list = new LinkedList<>(list);

		for (Iterator<String> itr = list.iterator(); itr.hasNext();) {
			System.out.print(itr.next() + " ");
		}
		System.out.println();
	}
}
