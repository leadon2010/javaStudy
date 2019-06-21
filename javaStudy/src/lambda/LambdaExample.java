package lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class SLength implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}

}

@FunctionalInterface
interface FunctionalInt {
	int sum();

	default void sout(String s) {
		System.out.println(s);
	};
}

public class LambdaExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");

//		Collections.sort(list, (s1, s2) -> {
//			return s1.length() - s2.length();
//		});

		Collections.sort(list, new SLength());

		for (String s : list) {
			System.out.println(s);
		}
	}
}
