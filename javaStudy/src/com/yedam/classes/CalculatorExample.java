package com.yedam.classes;

class Calculator {
	static double PI = 3.14159;
	String color;

	void setColor(String color) {
		this.color = color;
	}

	static int plus(int x, int y) {
		return x + y;
	}

	static int minus(int a, int b) {
		return a - b;
	}

}

public class CalculatorExample {
	public static void main(String[] args) {
		double result1 = 10 * 10 * Calculator.PI;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);

		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);

		// 초기화 블럭 선언은 ===> TelevisionExample.java
	}
}
