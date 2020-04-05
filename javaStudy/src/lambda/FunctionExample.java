package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {
	static List<Student> list = Arrays.asList(new Student("Hong", 99, 88), new Student("Hwang", 77, 66));

	static void printString(Function<Student, String> func) {
		for (Student student : list) {
			System.out.println(func.apply(student));
		}
	}

	static void printInt(ToIntFunction<Student> func) {
		for (Student student : list) {
			System.out.println(func.applyAsInt(student));
		}
	}

	static double avg(ToIntFunction<Student> func) {
		int sum = 0;
		for (Student student : list) {
			sum += func.applyAsInt(student);
		}
		double avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {

		System.out.println("[학생 이름]");
		printString(t -> t.getName());

		System.out.println("[영어 점수]");
		printInt((t) -> {
			return t.getEnglishScore();
		});

		System.out.println("[영어 평균]");
		System.out.println(avg(t -> t.getEnglishScore()));
	}
}
