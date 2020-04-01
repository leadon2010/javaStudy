package lambda.example;

import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> c = s -> System.out.println(s);
		c.accept("test1");
		c.accept("test2");
	}
}
