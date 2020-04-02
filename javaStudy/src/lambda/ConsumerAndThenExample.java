package lambda;

import java.util.function.Consumer;

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};

		Consumer<Member> consumerC = (m) -> {
			System.out.println("consumerC: " + m.getAddress());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerC).andThen(consumerB);
		consumerAB.accept(new Member("Hong", "h1234", new Address("USA", "LosAngeles")));
		
		consumerA.andThen(consumerB).andThen(consumerC).accept(new Member("Hwang", "h1111", new Address("Mexico", "Mexico City")));

	}
}
