package lambda;

@FunctionalInterface
interface MyInterface {
	int print(int a, int b);
}

class RunnableClass implements Runnable {

	@Override
	public void run() {
		System.out.println("RunnableClass expression");
	}

}

public class LambdaBasicExample {
	public static void main(String[] args) {
		Runnable runnable = new RunnableClass();
		runnable.run();

		runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("AnonymousClass expression.");
			}

		};
		runnable.run();

		runnable = () -> {
			System.out.println("Lambda Expression");
		};
		runnable.run();

		MyInterface myInterface = (num1, num2) -> {
			return num1 + num2;
		};

		int result = myInterface.print(3, 5);
		System.out.println("result is " + result);

	} // end of main
} // end of class
