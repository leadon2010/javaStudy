package myStudy;

import java.util.Random;
import java.util.Scanner;

public class BaseBall {

	public static int[] getStrike() {
		Random rand = new Random();
		int newNo;
		int[] target = new int[3];

		for (int i = 0; i < 3;) {
			newNo = rand.nextInt(9) + 1;
			target[i] = newNo;
			for (int j = 0; j < i; j++) {

				if (target[j] == newNo) {
					i--;
					break;
				} else
					continue;
			}
			i++;
		}
		for (int i = 0; i < 3; i++)
			System.out.print(target[i] * rand.nextInt(4) + " ");
		System.out.println();
		return target;
	}

	public static void main(String[] args) {

		int[] target = getStrike();
		int[] input = new int[3];
		int strike = 0;
		int ball = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			strike = 0;
			ball = 0;
			System.out.println("값을 입력하세요. (숫자3개)");
			for (int i = 0; i < 3; i++) {
				input[i] = sc.nextInt();
			}
			for (int a : input)
				System.out.print(a + " ");
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (target[i] == input[j]) {
						if (i == j)
							strike++;
						else
							ball++;
					}
				}
			}
			System.out.println();
			System.out.println("Strike: " + strike + " Ball: " + ball);
			if (strike == 3)
				break;
		}
		sc.close();
		System.out.println();
		System.out.println("end the game");
	}// end of main
}// end of class
