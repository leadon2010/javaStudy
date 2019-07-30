package thisisjava.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		try {
			String str1 = args[0];
			String str2 = args[1];
		} catch (ArrayIndexOutOfBoundsException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		int num1, num2;
		String s1, s2;
		s1 = "1";
		s2 = "a100";
		try {
			num1 = Integer.parseInt(s1);
			num2 = Integer.parseInt(s2);
			System.out.println("num1 => " + num1);
			System.out.println("num2 => " + num2);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);
		int menu;
		try {
			System.out.println("input number1>> ");
			menu = sc.nextInt();
			System.out.println("menu => " + menu);
		} catch (InputMismatchException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally {
			System.out.println("항상 실행되는 코드 처리.");
		}
		System.out.println();
		System.out.println("프로그램 정상 종료.");
	}
}
