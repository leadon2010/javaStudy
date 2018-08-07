package ch23th;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExam {
	public static void main(String[] args) {
		List<Employees> list = new ArrayList<>();
		list.add(new Employees(1, "first1", "last1", 100));
		list.add(new Employees(2, "first2", "last2", 200));
		list.add(new Employees(3, "first3", "last3", 300));

		for (Employees e : list) {
			System.out.println(e);

		}
		System.out.println();

		Employees emp;
		for (Iterator<Employees> itr = list.iterator(); itr.hasNext();) {
			emp = itr.next();
			if (emp.equals(new Employees(1, "first1", "last1", 100)))
				itr.remove();

		}
		for (Iterator<Employees> itr = list.iterator(); itr.hasNext();) {
			System.out.println(itr.next());
		}
		System.out.println();
	}
}
