package yoon.ch18;

import java.util.Scanner;

class ReadAgeException extends Exception {
	public ReadAgeException() {
		super("유효하지않은 나이가 입력되었습니다.");
	}
}

public class MyExceptionClass {
	public static void main(String[] args) {
		System.out.println("나이입력: ");

		try {
			int age = readAge();
			System.out.printf("입력된 나이는 : %d \n" + age);
		} catch (ReadAgeException e) {
			System.out.println(e.getMessage());
		}
	}// end of main

	public static int readAge() throws ReadAgeException {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		if (age < 0)
			throw new ReadAgeException();
		return age;
	}
}// end of class
