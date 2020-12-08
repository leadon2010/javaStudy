package streams.test.exam05;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToIntFunction;

public class Exam05 {
	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(//
				new Employee(1, "first", "20/05/05", 50, "IT_PROG", 4000), //
				new Employee(1, "first", "20/05/05", 50, "IT_PROG", 4000), //
				new Employee(1, "first", "20/05/05", 50, "IT_PROG", 4000)//
		);

		double avg = list.stream().mapToInt(new ToIntFunction<Employee>() {
			@Override
			public int applyAsInt(Employee value) {
				return value.getSalary();
			}
		}).average().getAsDouble();
		System.out.println("사원의 전체 평균: " + avg);
	}
}
