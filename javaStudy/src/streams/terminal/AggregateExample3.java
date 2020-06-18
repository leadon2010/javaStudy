package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class AggregateExample3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		int sum = numbers.stream().reduce(0, new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer t, Integer u) {
				System.out.println(t + ", " + u);
				return Integer.sum(t, u);
			}
		});
		System.out.println("sum: " + sum);

		////////////////////////////////////////////////////////
		double dsum = Employee.persons().stream().map(new Function<Employee, Double>() {
			@Override
			public Double apply(Employee t) {
				return t.getIncome();
			}
		}).reduce(0.0, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				return Double.sum(t, u);
			}
		});
		System.out.println("dsum: " + dsum);

		////////////////////////////////////////////////////////
		dsum = Employee.persons().stream().reduce(0.0, new BiFunction<Double, Employee, Double>() {
			@Override
			public Double apply(Double t, Employee u) {
				return t + u.getIncome();
			}
		}, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				return Double.sum(t, u);
			}
		});
		System.out.println("dsum: " + dsum);

	}
}
