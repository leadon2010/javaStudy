package streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class NoneExample {
	public static void main(String[] args) {
		String concatenated = Stream.of("Hello", "World").reduce("", new BinaryOperator<String>() {
			@Override
			public String apply(String t, String u) {
				return t.concat(u);
			}
		});

//		System.out.println(concatenated);

		List<String> list1 = Arrays.asList("Hello", "World");

		List<String> list2 = new ArrayList<String>();

		list1.addAll(list2);

		for (String str : list1) {
			System.out.println(str);
		}
	}
}
