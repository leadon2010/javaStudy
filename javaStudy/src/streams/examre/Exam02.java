package streams.examre;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Exam02 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("This is a java book", "Lambda Expressions",
				"Java8 supports lambda expressions");
		list.stream().filter(new Predicate<String>() {
			@Override
			public boolean test(String t) {
				return t.toUpperCase().indexOf("JAVA") > -1;
			}
		}).forEach(System.out::println);

	}
}
