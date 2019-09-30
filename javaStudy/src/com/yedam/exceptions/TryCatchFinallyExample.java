package com.yedam.exceptions;

public class TryCatchFinallyExample {
	public static void main(String[] args) {
		try {
			Class classes = Class.forName("java.lang.String2");

		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
			// e.printStackTrace();
		}
		System.out.println("프로그램의 마지막");
	}
}
