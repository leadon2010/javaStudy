package interfaces.board;

import java.util.Scanner;

public class BoardMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int menu = 0;

		while (true) {
			System.out.println("------------------------------------------------");
			System.out.println("1.글쓰기 2.수정 3.삭제 4.한건조회 5.전체리스트 9.종료");
			System.out.println("------------------------------------------------");
			menu = scn.nextInt();
			scn.nextLine();
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 5) {

			} else if (menu == 9) {
				break;
			}

		}
		System.out.println("end of program");
		scn.close();

	}
}
