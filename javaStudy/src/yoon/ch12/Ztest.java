package yoon.ch12;

import java.util.Scanner;

public class Ztest {
	public static void main(String[] args) {
		String input = "";
		String result = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("입력:");
			input = sc.nextLine();
			if (input.equals(""))
				break;
			result += input + " ";
		}
		System.out.println(result);
		System.out.println("==end of program==");
		// while (sc.hasNext()) {
		// result += sc.nextLine();
		// }
	}
}
