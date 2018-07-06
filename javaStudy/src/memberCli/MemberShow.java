package memberCli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberShow {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		MemberShow ms = new MemberShow();
		MembersDAO dao = new MembersDAO();

		// String menu = "";
		int menu = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("menu를 선택하세요.\n[1:list, 2:insert, 3:update, 4:delete]");
			// menu = sc.nextInt();sc.nextLine();
			try {
				menu = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("number format error!!");
				// e.printStackTrace();
			}
			dao.getConnection();
			if (menu == 1) {
				// 전체조회
				dao.getMemberList();
			} else if (menu == 2) {
				// 입력
				System.out.println("이름을 입력하세요.");
				String sname = dao.inputCheck(sc);// sc.nextLine();
				System.out.println("주민번호를 입력하세요.");
				String sssn = dao.inputCheck(sc);// sc.nextLine();
				System.out.println("연락처를 입력하세요.");
				String sphone = dao.inputCheck(sc);// sc.nextLine();
				MemberDTO dto = new MemberDTO(sname, sssn, sphone);
				dao.insertMember(dto);
				dao.getMemberList();
			} else if (menu == 3) {
				// 수정
				System.out.println("변경할 번호를 선택하세요");
				String sno = dao.inputCheck(sc);// sc.nextLine();
				System.out.println("이름을 입력하세요.");
				String sname = dao.inputCheck(sc);// sc.nextLine();
				System.out.println("주민번호를 입력하세요.");
				String sssn = dao.inputCheck(sc);// sc.nextLine();
				System.out.println("연락처를 입력하세요.");
				String sphone = dao.inputCheck(sc);// sc.nextLine();
				MemberDTO dto = new MemberDTO(sno, sname, sssn, sphone, "");
				dao.updateMember(dto);
				dao.getMemberList();
			} else if (menu == 4) {
				System.out.println("삭제할 번호를 선택하세요");
				String sno = sc.nextLine();
				System.out.println("sno==========" + sno);
				dao.deleteMember(sno);
				dao.getMemberList();
			} else {
				System.out.println("프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			}
			dao.connClose();
		} // end of while

	}//////// end of main
}
