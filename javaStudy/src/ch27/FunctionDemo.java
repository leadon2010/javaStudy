package ch27;

import java.util.function.Function;

class FunctionDemo {
	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		// Function<String, String> f = s -> s.substring(3);

		System.out.println(f.apply("Robot"));
		System.out.println(f.apply("System"));
	}
}