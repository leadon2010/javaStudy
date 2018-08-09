package employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListProc {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "first1", "last1", 1000));
		list.add(new Employee(2, "first2", "last2", 2000));
		list.add(new Employee(3, "first3", "last3", 3000));

		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println();
		list.remove(0);
		for (Employee e : list) {
			System.out.println(e);
		}
		System.out.println();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}// end of main
}// end of class
