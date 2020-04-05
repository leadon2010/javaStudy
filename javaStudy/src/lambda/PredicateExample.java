package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
	static List<Student> list = Arrays.asList(new Student("Hong", "M", 90, 80), new Student("hwang", "M", 99, 88),
			new Student("Lee", "F", 88, 89), new Student("Shin", "F", 98, 99));

	static double avg(Predicate<Student> pred) {
		int sum = 0, cnt = 0;
		for (Student student : list) {
			if (pred.test(student)) {
				sum += student.getEnglishScore();
				cnt++;
			}
		}
		double avg = (double) sum / cnt;
		return avg;
	}

	public static void main(String[] args) {
		double avg = avg((s) -> {
			return s.getSex().equals("M");
		});
		System.out.println("[평균점수]");
		System.out.println(avg);
	}

}
