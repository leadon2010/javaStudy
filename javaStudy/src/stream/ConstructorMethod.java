package stream;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorMethod {
	public static void main(String[] args) {
		Function<Integer, Member> fi = Member::new;
		fi.apply(10);

		BiFunction<String, Integer, Member> bfi = Member::new;
		bfi.apply("He", 20);

	}
}
