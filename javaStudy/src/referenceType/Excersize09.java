package referenceType;

import java.util.Scanner;

public class Excersize09 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1.학생수 |2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("------------------------");
			System.out.print("선택> ");

			int selectNo = sc.nextInt();

			if (selectNo == 1) {// 학생수만큼 배열선언.
				System.out.print("학생수> ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {// 학생점수입력.
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = sc.nextInt();
				}

			} else if (selectNo == 3) {// 배열전체조회.
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}

			} else if (selectNo == 4) {// 최고점,평균.
				int maxValue = 0, sum = 0;
				double avg = 0.0;
				for (int i = 0; i < scores.length; i++) {
					maxValue = (maxValue > scores[i] ? maxValue : scores[i]);
					sum += scores[i];
				}
				avg = (double) sum / scores.length;
				System.out.println("최고 점수: " + maxValue);
				System.out.printf("평균 점수: %.3f", avg);
				System.out.println();

			} else if (selectNo == 5) {// 종료.
				run = false;

			}
		}
		System.out.println("프로그램 종료.");
	}

}
