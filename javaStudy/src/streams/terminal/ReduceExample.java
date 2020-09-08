package streams.terminal;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name;
	}
}

public class ReduceExample {
	public static void main(String[] args) {
		List<Person> persons = Arrays.asList(new Person("Max", 18), new Person("Peter", 23), new Person("Pamela", 23),
				new Person("David", 12));

		int sum = persons.stream().reduce(new Integer(0), new BiFunction<Integer, Person, Integer>() {

			@Override
			public Integer apply(Integer t, Person u) {
				return t + u.age;
			}
		}, new BinaryOperator<Integer>() {

			@Override
			public Integer apply(Integer t, Integer u) {
				return t + u;
			}
		});
		
		System.out.println(sum);
	}
}
