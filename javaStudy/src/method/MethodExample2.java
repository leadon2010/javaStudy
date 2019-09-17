package method;

import java.util.Scanner;

public class MethodExample2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수 입력:");
		double a = sc.nextDouble();
		System.out.println("두번째 수 입력:");
		double b = sc.nextDouble();

		double result = sum(a, b); // a + b;
		System.out.println("두 수의 합은: " + result);

		result = div(a, b);
		System.out.printf("나눈 결과값: %.4f", result);

		sc.close();

	}

	public static double sum(double firstValue, double secondValue) {
		return (firstValue + secondValue);
	}

	public static double div(double a, double b) {
		return a / b;
	}

}
