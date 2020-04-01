package lambda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

class ConsumerClass<T> implements Consumer<T> {

	@Override
	public void accept(Object t) {
		System.out.println(t + " 입력되었습니다.");
	}

}

public class ConsumerExample {
	public static void main(String[] args) {
//		Consumer<String> cons = new ConsumerClass<String>();
//		cons.accept("Hello");

		Consumer<String> consumer = (t) -> {
			System.out.println(t + "8");
		};
		consumer.accept("java");

		BiConsumer<String, Integer> biConsumer = (t, u) -> {
			System.out.println(t + u);
		};
		biConsumer.accept("java", 8);

		DoubleConsumer doubleConsumer = (d) -> {
			System.out.println("java" + d);
		};
		doubleConsumer.accept(8);

		ObjIntConsumer<String> objConsumer = (s, a) -> {
			System.out.println(s + a);
		};
		objConsumer.accept("java", 8);
	}
}
