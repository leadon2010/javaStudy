package ch23;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(new Integer(5));
		list.add(new Integer(4));
		list.add(new Integer(2));
		list.add(new Integer(0));
		list.add(new Integer(1));
		list.add(new Integer(3));

		ArrayList<Integer> listc = new ArrayList<>(list.subList(1, 4));
		print(list, listc);

		Collections.sort(list);
		Collections.sort(listc);
		print(list, listc);

		System.out.println("list.retainAll(listc)  " + list.retainAll(listc));
		print(list, listc);

		for (int i = listc.size() - 1; i >= 0; i--) {
			if (list.contains(listc.get(i))) {
				listc.remove(i);
			}
		}
		print(list, listc);

	}// end of main

	static void print(ArrayList<?> a1, ArrayList<?> a2) {
		System.out.println("ArrayList1 " + a1);
		System.out.println("ArrayList2 " + a2);
		System.out.println();
	}

}// end of class
