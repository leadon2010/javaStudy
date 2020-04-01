package lambda;

@FunctionalInterface
interface MyFunctionalInterface {
	public int method(int a, int b);
}

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface ifs = (a, b) -> sum(a, b);
		int result = ifs.method(23, 45);
		System.out.println("result is " + result);
	};

	static int sum(int x, int y) {
		return x + y;
	}
}
