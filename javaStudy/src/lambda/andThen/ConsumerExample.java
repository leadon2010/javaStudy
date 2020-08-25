package lambda.andThen;

import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<Member> cons1 = (m) -> {
			System.out.println(m.getName());
		};

		Consumer<Member> cons2 = (m) -> {
			System.out.println(m.getId());
		};

		cons1.andThen(cons2).accept(new Member("Park", "park", null));
	}
}
