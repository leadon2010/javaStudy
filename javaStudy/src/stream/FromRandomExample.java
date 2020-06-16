package stream;

import java.util.Random;
import java.util.stream.IntStream;

public class FromRandomExample {
	static int sum;

	public static void main(String[] args) {
		Random random = new Random();
		IntStream stream = random.ints(10, 1, 100);
		stream.peek(n -> System.out.println(n)).filter(t -> t > 50).forEach(s -> {
			System.out.println("--> " + s);
			sum += s;
		});
		System.out.println("합계는: " + sum);
	}
}
