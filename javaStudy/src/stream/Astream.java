package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Astream {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 92), new Student("Hwang", 90), new Student("Park", 99));

		Stream<Student> stream = list.stream();
		stream.forEach((t) -> {
			System.out.println(t.getName() + ", " + t.getScore());
		});

		System.out.println("====================");

	}
}
