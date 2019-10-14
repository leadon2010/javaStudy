package lambda.thisisjava;

@FunctionalInterface
interface MyInterfaceNoArgs {
	public void method1();
}

@FunctionalInterface
interface MyInterfaceWithArgs {
	public void method2(int a);
}

@FunctionalInterface
interface MyInterfaceWithReturn {
	public int method3(int a);
}

@FunctionalInterface
interface MyFunctionalInterface {
	public int method(int a, int b);
}

public class MyFunctionInterfaceExample {
	public static void main(String[] args) {
		MyInterfaceNoArgs fina = () -> {
			System.out.println("no args lambda");
		};
		fina.method1();

		MyInterfaceWithArgs fiwa = (a) -> {
			System.out.println("result is " + a);
		};
		fiwa.method2(3);

		MyInterfaceWithReturn fiwr = (a) -> {
			return a * 3;
		};
		int result = fiwr.method3(5);
		System.out.println("result is " + result);

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
