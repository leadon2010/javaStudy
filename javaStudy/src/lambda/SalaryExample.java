package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee {
	private String firstName;
	private int salary;

	public Employee(String firstName, int salary) {
		super();
		this.firstName = firstName;
		this.salary = salary;
	}

	public String getFirstName() {
		return firstName;
	}

	public int getSalary() {
		return salary;
	}

}

public class SalaryExample {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(new Employee("Name1", 10), new Employee("Name2", 20),
				new Employee("Name3", 22));

		Stream<Employee> stream = list.stream();
		stream.filter((e) -> e.getSalary() >= 20).forEach((s) -> System.out.println(s.getFirstName()));
	}
}
