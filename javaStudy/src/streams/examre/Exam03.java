package streams.examre;

import java.util.Arrays;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class Exam03 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("Hong", 30), new Member("Shin", 40), new Member("Kim", 26));
		double avg = list.stream().mapToDouble(new ToDoubleFunction<Member>() {
			@Override
			public double applyAsDouble(Member value) {
				return value.getAge();
			}
		}).average().getAsDouble();

		System.out.println("평균 나이: " + avg);
	}
}
