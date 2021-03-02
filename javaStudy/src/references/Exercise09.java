package references;

import java.util.Scanner;

enum Menu {
	CREATE(1), SCORES(2), LIST(3), ANALYSYS(4), EXIT(5);

	int value;

	Menu(int value) {
		this.value = value;
	}

	Menu getMenu(int value) {
		Menu[] menus = Menu.values();
		for (Menu m : menus) {
			System.out.println(m);
		}
		return menus[value];
	}
}

public class Exercise09 {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scn = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.점수리스트 4.분석 5.종료");
			System.out.println("--------------------------------------------------");
			System.out.print("선택 > ");

			int selectNo = scn.nextInt();
			if (!(selectNo == 1 || selectNo == 5) && scores == null) {
				System.out.println("학생수를 먼저 입력하세요 !!!");
				System.out.println();
				continue;
			}

			if (selectNo == 1) {
				System.out.print("학생수> ");
				studentNum = scn.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = scn.nextInt();
				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}

			} else if (selectNo == 4) {
				int maxValue = 0;
				int sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					sum += scores[i];
					if (maxValue < scores[i]) {
						maxValue = scores[i];
					}
				}
				avg = (double) sum / scores.length;
				avg = (int) (avg * 100) / 100.0;
				System.out.println("최고 점수: " + maxValue);
				System.out.println("평균 점수: " + avg);

			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		scn.close();
	}
}
