package yoon.ch23;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

class ListIteratorCollection {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Toy", "Box", "Robot", "Box");
		list = new ArrayList<>(list);

		ListIterator<String> litr = list.listIterator();
		String str;

		// 왼쪽에서 오른쪽으로
		while (litr.hasNext()) {
			System.out.print("nextindex() :" + litr.nextIndex() + " ");
			str = litr.next();
			System.out.print(str + '\t');

			if (str.equals("Toy"))
				litr.add("Toy2");
		}
		System.out.println();

		// litr = list.listIterator();
		// 오른쪽에서 왼쪽으로
		while (litr.hasPrevious()) {
			System.out.print("nextindex() :" + litr.nextIndex() + " ");
			str = litr.previous();
			System.out.print(str + '\t');

			if (str.equals("Robot"))
				litr.add("Robot2");
		}
		System.out.println();

		// 다시 왼쪽에서 오른쪽으로
		for (Iterator<String> itr = list.iterator(); itr.hasNext();)
			System.out.print(itr.next() + '\t');
		System.out.println();

	}
}
