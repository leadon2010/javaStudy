package streams.test.exam06;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import streams.test.exam05.Employee;

public class Exam06 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(//
				new Employee(1, "first", "20/05/05", 50, "IT_PROG", 4000), //
				new Employee(1, "first", "20/05/05", 50, "IT_PROG", 4000), //
				new Employee(1, "first", "20/05/05", 50, "IT_PROG", 4000)//
		);
		double avg = list.stream().filter(new Predicate<Employee>() {
			@Override
			public boolean test(Employee t) {
				return t.getJobId().equals("IT_PROGs");
			}
		}).mapToInt(new ToIntFunction<Employee>() {
			@Override
			public int applyAsInt(Employee value) {
				return value.getSalary();
			}
		}).average().orElse(0.0);

		System.out.println("직무 평균: " + avg);
	}
}
