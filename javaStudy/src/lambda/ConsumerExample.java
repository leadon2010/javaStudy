package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {
		Consumer<String> consumer = (t) -> System.out.println(t + " world");
		consumer.accept("Hello");

		BiConsumer<String, String> biConsumer = new BiConsumer<String, String>() {
			@Override
			public void accept(String t, String u) {
				System.out.println(t + " " + u);
			}
		};
		biConsumer.accept("Hello", "World");

		DoubleConsumer doubleConsumer = (value) -> {
			System.out.println("Hello " + value);
		};
		doubleConsumer.accept(44);

		ObjIntConsumer<String> oic = (t, value) -> {
			System.out.println(t + " " + value);
		};
		oic.accept("Hello", 40);

	}
}
