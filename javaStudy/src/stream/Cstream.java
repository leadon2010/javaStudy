package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Cstream {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 97), new Student("Hwang", 80), new Student("Park", 85));
		Stream<Student> stream = list.stream();
		stream.forEach((t) -> {
			System.out.println(t.getName());
		});

		System.out.println("============================");

		String[] strAry = { "Hong", "Hwang", "Park", "Choi" };
		Stream<String> strStream = Arrays.stream(strAry);
		strStream.forEach((s) -> {
			System.out.println(s.toString());
		});

		System.out.println("============================");

		int[] intAry = { 1, 2, 3 };
		IntStream intStream = Arrays.stream(intAry);
		intStream.forEach((i) -> {
			System.out.println(i);
		});

		System.out.println("============================");

		stream = list.stream();
		double avg = stream.mapToInt(Student::getScore).average().getAsDouble();
		System.out.println("Average: " + avg);

		System.out.println("============================");

		intStream = IntStream.rangeClosed(1, 100);
		intStream.forEach(i -> {
			System.out.println(i);
		});
	}
}
