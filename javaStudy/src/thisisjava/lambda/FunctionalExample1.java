package thisisjava.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

class Student {
	String name;
	int englistScore;
	int mathScore;

	public Student(String name, int englistScore, int mathScore) {
		super();
		this.name = name;
		this.englistScore = englistScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEnglistScore() {
		return englistScore;
	}

	public int getMathScore() {
		return mathScore;
	}

}

public class FunctionalExample1 {
	private static List<Student> list = Arrays.asList(new Student("hong", 90, 96), new Student("kang", 95, 93));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student));
		}
	}

	public static void printInt(ToIntFunction<Student> function) {
		for (Student student : list) {
			System.out.println(function.applyAsInt(student));
		}
	}

	public static double avg(ToIntFunction<Student> function) {
		double sum = 0;
		for (Student student : list) {
			sum += function.applyAsInt(student);
		}
		return (sum / list.size());
	}

	public static void main(String[] args) {
		System.out.println("[학생이름]");
		printString(t -> {
			return t.getName();
		});

		System.out.println("[영어점수]");
		printInt(t -> t.getEnglistScore());
		System.out.println("[수학점수]");
		printInt(t -> t.getMathScore());

		System.out.println("[영어평균점수]");
		double result = avg(s -> {
			return s.getEnglistScore();
		});
		System.out.println(result);

		System.out.println("[수학점수Avg]");
		System.out.println(avg(t -> t.getMathScore()));

	}
}
