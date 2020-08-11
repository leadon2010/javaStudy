package streams.terminal;

import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import streams.terminal.Employee.Gender;

public class AggregateExample4toMap {
	public static void main(String[] args) {
		Map<Employee.Gender, String> genderToNames = Employee.persons().stream()
				.collect(Collectors.toMap(new Function<Employee, Employee.Gender>() {
					@Override
					public Gender apply(Employee t) {
						return t.getGender();
					}
				}, new Function<Employee, String>() {
					@Override
					public String apply(Employee t) {
						return t.getName();
					}
				}, new BinaryOperator<String>() {
					@Override
					public String apply(String t, String u) {
						return String.join(", ", t, u);
					}
				}));
		System.out.println(genderToNames);
	}
}
