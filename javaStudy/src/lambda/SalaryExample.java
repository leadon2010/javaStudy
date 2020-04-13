package lambda;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Employee implements Comparable<Employee> {
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

	@Override
	public int compareTo(Employee o) {
		return this.firstName.compareTo(o.firstName);
	}

}

public class SalaryExample {
	public static void main(String[] args) throws IOException {
		List<Employee> list = Arrays.asList(new Employee("Name3", 10), new Employee("Name2", 20),
				new Employee("Name1", 22));
		FileWriter os = null;
//		new FileOutputStream("employee.txt");
		os = new FileWriter("employee.txt");

		Stream<Employee> stream = list.stream();
		stream.filter((e) -> e.getSalary() >= 20).forEach((s) -> System.out.println(s.getFirstName()));
		System.out.println("=======================");

		list.stream().sorted().filter((e) -> e.getSalary() >= 20).forEach(s -> System.out.println(s.getFirstName()));

		for (Employee emp : list) {
//			byte[] buf = emp.getFirstName().getBytes();

			os.write(emp.getFirstName() + "\n");
			os.flush();
		}
		os.close();
		System.out.println("end of progs");
	}
}
