package stream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class IteratorVvStreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("hong", "shin", "kang");

		Iterator<String> itor = list.iterator();
		while (itor.hasNext()) {
			System.out.println(itor.next());
		}
		System.out.println();

		Stream<String> stream = list.stream();
		stream.forEach((name) -> System.out.println(name));
	}
}
