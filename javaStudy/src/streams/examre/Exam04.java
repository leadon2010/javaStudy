package streams.examre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exam04 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("Hong", "Developer"), new Member("Shin", "Designer"),
				new Member("Kim", "Developer"));

		List<Member> developers = list.stream().filter(new Predicate<Member>() {
			@Override
			public boolean test(Member t) {
				return t.getJob().equals("Developer");
			}
		}).collect(Collectors.toList());

		developers.stream().forEach(s -> System.out.println(s.getName()));
	}
}
