package references;

import java.util.Scanner;

public class HomeWork {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[][] students = null;
		int studentNum = 0;

		while (true) {
			System.out.println("------------------------------------------------------------");
			System.out.println("1.학생수 2.점수입력 3.리스트 4.조회 5.영어최고점 6.합계최고 7.수학평균점이상 9.종료");
			System.out.println("------------------------------------------------------------");
			System.out.print("선택> ");

			int menu = scn.nextInt();
			if ((menu == 1 || menu == 2) && students != null && students[0][0] != 0) {
				System.out.println("이미 입력했습니다.");
				continue;
			}

			if (menu == 1) { // 1. 학생수를 입력받아서
				System.out.print("학생수 > ");
				studentNum = scn.nextInt();
				students = new int[studentNum][3];

			} else if (menu == 2) {// 학생번호에 따라 영어, 수학 점수를 저장하세요.
				for (int i = 0; i < students.length; i++) {
					System.out.print("학생번호>> ");
					int stdNo = scn.nextInt();
					System.out.print("영어점수> ");
					int engScore = scn.nextInt();
					System.out.print("수학점수> ");
					int mathScore = scn.nextInt();
					students[i] = new int[] { stdNo, engScore, mathScore };
				}

			} else if (menu == 3) {// 2. 입력한 값의 리스트를 학생번호 - 영어 / 수학 점수의 순으로 보여주는 코드를 작성하세요.
				for (int[] stud : students) {
					String studInfo = "학생정보 - 번호:" + stud[0] + ", 영어:" + stud[1] + ", 수학:" + stud[2];
					System.out.println(studInfo);
				}

			} else if (menu == 4) {// 3. 학생번호를 입력하면 학생의 영어, 수학의 합계점수와 평균점수를 보여주는 기능을 작성하세요.
				System.out.print("찾고자 하는 학생번호 입력> ");
				int studNo = scn.nextInt();
				for (int i = 0; i < students.length; i++) {
					if (students[i][0] == studNo) {
						String studInfo = "학생정보 - 번호:" + students[i][0] + ", 영어:" + students[i][1] + ", 수학:"
								+ students[i][2];
						System.out.println(studInfo);
						break;
					}
				}

			} else if (menu == 5) {// 4. 영어점수가 가장 높은 학생번호와 점수를 보여주는 기능을 구현하세요.
				int studNo = 0;
				int maxScore = 0;
				for (int i = 0; i < students.length; i++) {
					if (maxScore < students[i][1]) {
						maxScore = students[i][1];
						studNo = students[i][0];
					}
				}
				System.out.println("영어최고점: 학생번호 - " + studNo + " - 영어: " + maxScore);

			} else if (menu == 6) {// 5. 합계점수가 가장 높은 학생번호와 평균을 보여주는 기능을 작성하세요.
				int maxValue = 0;
				int studNo = 0;
				for (int[] student : students) {
					int sum = student[1] + student[2];
					int tempNo = student[0];
					if (maxValue < sum) {
						maxValue = sum;
						studNo = tempNo;
					}
				}
				double avg = (maxValue * 10 / 2) / 10.0;
				String studInfo = "학생번호: " + studNo + " 평균점수: " + avg;
				System.out.println(studInfo);

			} else if (menu == 7) {// 6. 수학점수가 수학평균점수 이상인 학생의 번호와 수학점수를 보여주도록 코드를 작성하세요.
				int sum = 0;
				double avg = 0.0;
				for (int[] stud : students) {
					sum += stud[1];
				}
				avg = (sum * 10 / students.length) / 10.0;
				System.out.println("평균점수: " + avg);
				for (int[] student : students) {
					if (student[2] > avg) {
						System.out.println("학생번호: " + student[0] + ", 수학점수: " + student[2]);
					}
				}

			} else if (menu == 9) {
				break;

			}
		}
		System.out.println("프로그램 종료.");
		scn.close();
	}
}
