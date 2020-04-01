package lambda;

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

public class FunctionalExample {
	static Student s1 = new Student("Hong", 88, 92);
	static Student s2 = new Student("Hwang", 99, 88);
	static Student s3 = new Student("Park", 89, 79);

	static List<Student> list = Arrays.asList(s1, s2, s3);

	public static void printString(Function<Student, String> func) {
		for (Student s : list) {
			System.out.println(func.apply(s));
		}
	}

	public static void printInt(ToIntFunction<Student> func) {
		for (Student s : list) {
			System.out.println(func.applyAsInt(s));
		}
	}

	public static double avg(ToIntFunction<Student> func) {
		double sum = 0;
		for (Student s : list) {
			sum += func.applyAsInt(s);
		}
		return sum / list.size();
	}

	public static void main(String[] args) {
		System.out.println("학생이름:");
		printString((a) -> {
			return a.getName() + " => 영어: " + a.getEnglistScore() + ", 수학: " + a.getMathScore();
		});
		System.out.println("영어점수:");
		printInt((a) -> {
			return a.getEnglistScore();
		});
		System.out.println("수학점수:");
		printInt((t) -> {
			return t.getMathScore();
		});
		System.out.println("English평균:");
		System.out.println(avg((t) -> {
			return t.getMathScore();
		}));

	}
}
