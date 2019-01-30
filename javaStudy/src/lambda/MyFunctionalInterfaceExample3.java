package lambda;

interface MyFunctionalInterface3 {
	public int method(int x, int y);
}

public class MyFunctionalInterfaceExample3 {
	public static void main(String[] args) {
		MyFunctionalInterface3 fi;

		fi = (x, y) -> {
			int result = x * y;
			return result;
		};
		System.out.println("result is : " + fi.method(4, 2));

		fi = (x, y) -> {
			return x * y;
		};
		System.out.println("result is : " + fi.method(4, 3));

		fi = (x, y) -> x * y;
		System.out.println("result is : " + fi.method(4, 4));

		fi = (x, y) -> results(x, y);
		System.out.println("result is : " + fi.method(4, 5));

	}

	static int results(int a, int b) {
		return (a * b);
	}
}
