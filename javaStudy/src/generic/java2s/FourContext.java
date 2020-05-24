package generic.java2s;

public class FourContext {

	public static void main(String[] args) {

		// Assignment context : A lambda expression can appear to the right of the
		// assignment operator.
		Calculator calculator = (x, y) -> x + y;
		System.out.println(calculator.calculate(10, 20));

		// Method Invocation Context : We can use a lambda expression as an argument for
		// a method or constructor.
		execute((x, y) -> x * y);

		// Return Context : we can use a lambda expression in a return statement, and
		// its target type is declared in the method return type.
		System.out.println(execute().calculate(3, 6));

		// Cast Context : We can use a lambda expression preceded by a cast. The type
		// specified in the cast is its target type.
	}

	private static void execute(Calculator calculator) {
		int x = 10, y = 20;
		int result = calculator.calculate(x, y);
		System.out.println("결과값은 " + result);
	}

	private static Calculator execute() {
		return (x, y) -> x + y;
	}
}
