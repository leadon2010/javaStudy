package generic.java2s;

public class Main {
	public static void main(String[] args) {
		execute(new Calculator() {

			@Override
			public int calculate(int x, int y) {
				return x + y;
			}

		});

		execute((int x, int y) -> {
			return x * y;
		});

		execute((long x, long y) -> x / y);

		execute((int x, int y) -> x % y);
	}

	public static void execute(Calculator calculator) {
		int x = 10, y = 20;
		int result = calculator.calculate(x, y);
		System.out.println("result is " + result);
	}

	public static void execute(LongCalculator calculator) {
		long x = 10, y = 20;
		long result = calculator.calculate(x, y);
		System.out.println("result is " + result);
	}
}

@FunctionalInterface
interface Calculator {
	public int calculate(int x, int y);
}

@FunctionalInterface
interface IntCalculator {
	public int calculate(int x, int y);
}

@FunctionalInterface
interface LongCalculator {
	public long calculate(long x, long y);
}
