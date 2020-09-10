package streams.terminal;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import streams.terminal.Employee.Gender;

public class AggregateExample4Collect {
	public static void main(String[] args) {

		// 사원테이블의 부서별 금액을 합계해보면 좋겠네...

		// 1-1) toMap
		Map<String, Double> toDouble = null;
		toDouble = Employee.persons().stream()//
				.collect(Collectors.toMap(new Function<Employee, String>() {
					@Override
					public String apply(Employee t) {
						return t.getName();
					}
				}, new Function<Employee, Double>() {
					@Override
					public Double apply(Employee t) {
						return t.getIncome();
					}
				}));
		for (Map.Entry<String, Double> ent : toDouble.entrySet()) {
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}
		System.out.println();

		// 1-2) toMap
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
		for (Map.Entry<Employee.Gender, String> ent : genderToNames.entrySet()) {
			System.out.println(ent.getKey() + " => {" + ent.getValue() + "}");
		}
		System.out.println();

		// 2) toList
		List<Employee> toList = Employee.persons().stream()//
				.collect(Collectors.toList());
		for (Employee emp : toList) {
			System.out.println(emp);
		}
		System.out.println();

		// 3) toSet
		Set<Employee> toSet = Employee.persons().stream().collect(Collectors.toSet());
		Iterator<Employee> iter = toSet.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}

	}
}
