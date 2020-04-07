package stream.mapping;

import java.util.Arrays;
import java.util.List;

public class ReductionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 90), new Student("Hwang", 95), new Student("Choi", 88));
		int sum = list.stream().mapToInt(s -> s.getScore()).reduce(0, (a, b) -> a + b);
		System.out.println("sum: " + sum);
		System.out.println("=========");

		sum = list.stream().filter(s -> s.getScore() == 100).mapToInt(Student::getScore).reduce(0, (a, b) -> a + b);
		System.out.println("sum: " + sum);
	}
}
