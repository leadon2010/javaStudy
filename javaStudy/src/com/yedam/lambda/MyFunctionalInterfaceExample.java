package com.yedam.lambda;

@FunctionalInterface
interface MyFunctionalInterface {
	public void method();
}

public class MyFunctionalInterfaceExample {
	public static void main(String[] args) {
		MyFunctionalInterface fi;

		fi = () -> {
			String str = "method call";
			System.out.println(str);
		};
		fi.method();

		fi = () -> {
			System.out.println("method call the second");
		};
		fi.method();

		fi = () -> System.out.println("method call the third");
		fi.method();
	}
}
