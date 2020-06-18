package streams.lambdas;

import java.util.function.BiFunction;

public class FunctionExample {
	public static void main(String[] args) {
		BiFunction<String, String, String> bifunc = new BiFunction<String, String, String>() {
			@Override
			public String apply(String t, String u) {
				return t + ", " + u;
			}
		};
		System.out.println(bifunc.apply("hello", "world"));
	}
}
