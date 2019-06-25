package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class lambdaExpressionExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("hong", 90), new Student("kang", 92));

		Stream<Student> stream = list.stream();
		stream.forEach(s -> {
			String name = s.getName();
			int score = s.getScore();
			System.out.println(name + "-" + score);
		});
	}
}
