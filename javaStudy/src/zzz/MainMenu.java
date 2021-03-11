package zzz;

import java.util.Scanner;

public class MainMenu {
	public static void main(String[] args) {
		String id = "admin";
		String pw = "super";
		Scanner scn = new Scanner(System.in);
		boolean pass = false;
		StudentDAO dao = new StudentDAO();

		while (true) {

			if (!pass) {
				System.out.print("input id >> ");
				String inputId = scn.nextLine();
				System.out.print("input pw >> ");
				String inputPw = scn.nextLine();
				if (inputId.equals(id) && inputPw.equals(pw)) {
					System.out.println("Success");
					pass = true;
				} else {
					System.out.println("Fail");
					continue;
				}
			}
			System.out.println("---------------------------");
			System.out.println("1)성적입력 2)수정 3)삭제 9)종료");
			System.out.println("---------------------------");
			int menu = 0;
			menu = scn.nextInt();
			if (menu == 1) {
				for (Student student : dao.getStudentList()) {
					if (student != null) {
						System.out.print(
								student.getStdId() + "/" + student.getStdName() + "/" + student.getStdScore() + "> ");
						int score = scn.nextInt();
						student.setStdScore(score);
						dao.updateScore(student);
					}
				}
				System.out.println("변경완료.");

			} else if (menu == 9) {
				break;
			}

		}
		scn.close();
		System.out.println("end of program");
	}
}
