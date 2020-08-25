package lambda.function;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionExample {

	static List<Student> list = Arrays.asList(new Student("Hong", 90, 95), new Student("Hwang", 80, 88));

	public static void printString(Function<Student, String> function) {
		for (Student student : list) {
			System.out.println(function.apply(student));
		}
	}

	public static void printInt(Function<Student, Integer> function) {
		for (Student student : list) {
			System.out.println(function.apply(student));
		}
	}

	public static double avg(ToIntFunction<Student> function) {
		int sum = 0;
		for (Student std : list) {
			sum += function.applyAsInt(std);
		}
		double avg = (double) sum / list.size();
		return avg;
	}

	public static void main(String[] args) {

		System.out.println("[학생이름]");
		printString((Student t) -> {
			return t.getName();
		});
		System.out.println("[영어점수]");
		printInt(new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				return t.getEngScore();
			}
		});

		System.out.println("[영어평균]");
		System.out.println(avg((value) -> value.getEngScore()));

	}
}
