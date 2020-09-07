package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
		System.out.println("  iterator  ");
		List<String> users = Arrays.asList("홍길동", "김유신", "곽재우");
		Iterator<String> iter = users.iterator();
		while (iter.hasNext()) {
			String result = iter.next();
			System.out.println(result);
		}

		System.out.println("  stream  ");
		Stream<String> stream = users.stream();
		stream.forEach((name) -> System.out.println(name));
	}
}
