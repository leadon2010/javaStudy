package ch99;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Num {
	int num;

	public Num(int i) {
		num = i;
	}

	@Override
	public String toString() {
		return "Num= " + num;
	}

}

public class ListTest {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);

		// System.out.println(list.get(0));

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		List<Num> nlist = new ArrayList<>();
		Num num1 = new Num(1);
		Num num2 = new Num(3);
		Num num3 = new Num(5);

		nlist.add(num1);
		nlist.add(num2);
		nlist.add(num3);

		for (Num i : nlist)
			System.out.println(i);

		// Iterator<Num> itr = nlist.iterator();
		for (Iterator<Num> itr = nlist.iterator(); itr.hasNext();)
			System.out.println(itr.next());

		Iterator<Num> itr = nlist.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());

	}
}
