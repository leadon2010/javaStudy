package thisisjava;

import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
//		AccountExample acc = new AccountExample();
//		acc.execute();

		Scanner sc = new Scanner(System.in);

		int[] ansAry = new int[3];
		int[] insAry = new int[3];
		int input = 0;

		for (int i = 0; i < ansAry.length;) {
			boolean notExist = true;
			input = (int) ((Math.random() * 9) + 1);
			// 동일한 값이 추출되었는지 체크.
			for (int j = 0; j < i; j++) {
				if (ansAry[j] == input) {
					notExist = false;
					break;
				}
			}
			if (notExist) {
				ansAry[i] = input;
				i++;
			}
		}
		System.out.println();

		while (true) {
			for (int i = 0; i < 3; i++) {
				System.out.println("input number(1~9)");
				insAry[i] = sc.nextInt();
			}

			int strike = 0;
			int ball = 0;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (ansAry[i] == insAry[j] && i == j) {
						strike++;
					} else if (ansAry[i] == insAry[j] && i != j) {
						ball++;
					}
				}
			}
			System.out.print("strike : " + strike + ", ball : " + ball + "\n");

			if (strike == 3) {
				for (int i = 0; i < ansAry.length; i++) {
					System.out.print(ansAry[i] + " ");
				}
				break;
			}
		}
		System.out.println("end ");
	}
}
