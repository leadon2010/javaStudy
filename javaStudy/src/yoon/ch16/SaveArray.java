package yoon.ch16;

import java.util.Scanner;

public class SaveArray {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		int num;
		int cnt = 0;
		while (true) {
			System.out.println("저장할 숫자를 입력하세요.");
			num = sc.nextInt();
			sc.nextLine();
			arr[cnt++] = num;
			if (cnt == 5)
				break;
		}
		for (int i = 0; i < cnt; i++) {
			System.out.println("입력하신 값은: " + arr[i]);
		}
		System.out.println("end of program");
	}// end of main
}// end of class
