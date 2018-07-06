package memberCli;

import java.sql.SQLException;
import java.util.Scanner;

public class MemberShow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MembersProc mp = new MembersProc();
		// String menu = "";
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("menu를 선택하세요.[1:list, 2:insert, 3:update, 4:delete, 5:getMember]");
			// menu = sc.nextInt();sc.nextLine();
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("[1-5] 번호를 선택하세요.[1:list, 2:insert, 3:update, 4:delete, 5:getMember]");
				System.out.println(menu);
				// e.printStackTrace();
			}
			if (menu == 1) {
				// 전체조회
				mp.getMemberListProc();
			} else if (menu == 2) {
				// 입력
				mp.insertProc();
			} else if (menu == 3) {
				// 수정
				mp.updateProc();
			} else if (menu == 4) {
				// 삭제
				mp.deleteProc();
			} else if (menu == 5) {
				// 단건조회
				mp.getMember();
			} else {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			}
		} // end of while

	}//////// end of main
}
