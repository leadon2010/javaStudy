package exam;

import java.util.ArrayList;
import java.util.List;



public class Exam01 {
	public static void main(String[] args) {
		Employee e1 = new Employee("firstName1", 15);
		Employee e2 = new Employee("firstName2", 25);
		Employee e3 = new Employee("firstName3", 25);

//		List<Employee> list = Arrays.asList(e1, e2, e3);
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		list.stream().filter(e -> e.getSalary() >= 20).sorted((a, b) -> b.compareTo(a))
				.forEach(s -> System.out.println(s.getFirstName()));
	}
}
