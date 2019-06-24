package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student {
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

}

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
