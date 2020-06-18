package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

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

		////////////////////////////////////////////////////////
		double summ = Employee.persons().stream().reduce(0.0, new BiFunction<Double, Employee, Double>() {
			@Override
			public Double apply(Double t, Employee u) {
				double accumulated = t + u.getIncome();
				System.out.println(Thread.currentThread().getName() + " - Accumulator: partialSum = " + t
						+ ", person = " + u + ", accumulated = " + accumulated);
				return accumulated;
			}
		}, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				double combined = t + u;
				System.out.println(Thread.currentThread().getName() + " - combiner: a = " + t + ", b = " + u
						+ ", combined = " + combined);
				return combined;
			}
		});
		System.out.println("result: " + summ);
		System.out.println("-------------------------------------------------------");

		summ = Employee.persons().parallelStream().reduce(0.0, new BiFunction<Double, Employee, Double>() {
			@Override
			public Double apply(Double t, Employee u) {
				double accumulated = t + u.getIncome();
				System.out.println(Thread.currentThread().getName() + " - Accumulator: partialSum = " + t
						+ ", person = " + u + ", accumulated = " + accumulated);
				return accumulated;
			}
		}, new BinaryOperator<Double>() {
			@Override
			public Double apply(Double t, Double u) {
				double combined = t + u;
				System.out.println(Thread.currentThread().getName() + " - combiner: a = " + t + ", b = " + u
						+ ", combined = " + combined);
				return combined;
			}
		});
		System.out.println("result: " + summ);

		////////////////////////////////////////////////////////
		Optional<Integer> max = Stream.of(1, 2, 3, 4, 5).reduce(Integer::max);

		if (max.isPresent()) {
			System.out.println("max = " + max.get());
		} else {
			System.out.println("max is not  defined.");
		}

		max = Stream.<Integer>empty().reduce(Integer::max);
		if (max.isPresent()) {
			System.out.println("max = " + max.get());
		} else {
			System.out.println("max is not  defined.");
		}

		////////////////////////////////////////////////////////
		Optional<Employee> person = Employee.persons().stream().reduce(new BinaryOperator<Employee>() {
			@Override
			public Employee apply(Employee t, Employee u) {
				return t.getIncome() > u.getIncome() ? t : u;
			}
		});
		if(person.isPresent())
			System.out.println("Highest earner: " + person.get());
		else
			System.out.println("no");
	}
}
