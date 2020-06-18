package streams.intermediate;

import java.util.List;
import java.util.function.Predicate;

public class FilterExample {
	public static void main(String[] args) {
		List<Employee> persons = Employee.persons();
		persons.stream().peek(System.out::println).filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.isFemale();
			}
		}).forEach(p -> p.setIncome(p.getIncome() * 1.1));

		System.out.println("연봉협상 후");
		for (Employee emp : persons) {
			System.out.println(emp);
		}
	}
}
