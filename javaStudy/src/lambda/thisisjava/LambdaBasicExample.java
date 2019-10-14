package lambda.thisisjava;

@FunctionalInterface
interface MyInterface {
	int print(int a, int b);
}

public class LambdaBasicExample {
	public static void main(String[] args) {

		MyInterface myInterface = (num1, num2) -> {
			return num1 + num2;
		};

		int result = myInterface.print(3, 5);
		System.out.println("result is " + result);

//		Runnable runnable = new Runnable() {
//
//			@Override
//			public void run() {
//				System.out.println("Runnable express.");
//			}
//
//		};
//		runnable.run();
//
//		runnable = () -> {
//			System.out.println("Lambda Expression");
//		};
//		runnable.run();

	} // end of main
} // end of class
