package com.samplePkg;

interface Printable {
	void print(String s);
}

interface Calculable {
	int add(int a, int b);
}

public class Exe1 {
	public static void main(String[] args) {
		Printable prn = (s) -> {
			System.out.println("출력값: " + s);
		};
		prn.print("lch");

		Calculable cl = (a, b) -> {
			return (a + b);
		};

		System.out.println("두 수의 합은: " + cl.add(4, 5));

	}// end of main
}// end of class
