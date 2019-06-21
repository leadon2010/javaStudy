package lambda.thisisjava;

@FunctionalInterface
interface MyFunctionalInterface {
	public int method(int a, int b);
}

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi = (a, b) -> {
			return (a + b);
		};
		System.out.println(fi.method(3, 5));

		fi = (a, b) -> a + b;
		System.out.println(fi.method(4, 5));

		fi = (a, b) -> sum(a, b);
		System.out.println(fi.method(5, 5));

	}

	static int sum(int x, int y) {
		return x + y;
	}
}
