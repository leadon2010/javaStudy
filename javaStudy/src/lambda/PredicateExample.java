package lambda;

import java.util.Arrays;
import java.util.List;

public class PredicateExample {

	public static class Student {
		private String name;
		private String gender;
		private int score;

		public Student(String name, String gender, int score) {
			super();
			this.name = name;
			this.gender = gender;
			this.score = score;
		}

		public String getName() {
			return name;
		}

		public String getGender() {
			return gender;
		}

		public int getScore() {
			return score;
		}
	}

	static List<Student> list = Arrays.asList(new Student("Hong", "Man", 90), new Student("Hwang", "Woman", 99),
			new Student("Park", "Man", 88), new Student("Choi", "Woman", 95));

	public static void main(String[] args) {

	}
}
