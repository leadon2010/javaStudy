package com.yedam.variablesAndTypes;

public class Variable {

	public static void main(String[] args) {
		int score, numbers, total;
		score = 10;
		int totals = 36;

		int a = 30;
		int b = 073;
		int c = 0x1A;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

		System.out.println(5E7 * 3 - 13245);
		boolean result = true;
		// result = !result;
		if (result) {
			System.out.println("Result is " + result);
		} else {
			System.out.println("Result is " + result);
		}

		for (int i = 0; i < 10; i++) {
			// System.out.println("i is " + i);
		}

		int j = 10;
		while (j > 0) {
			j--;// System.out.println("j is " + j--);
		}

		int v1 = 15;
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		// int v3 = v2 - v1; // 에러 발생. v2에 대한 값을 읽을 수가 없다.

		char charValue = 'A';
		int intValue = charValue;
		System.out.println(charValue);
		System.out.println(intValue);

		float floatValue = 3.14F;
		double doubleValue = 3.14;
		for (int i = 0; i < 10; i++) {
			floatValue += 0.001;
			doubleValue += 0.001;
		}
		System.out.println(floatValue);
		System.out.println(doubleValue);
	}

}
