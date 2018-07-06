package memberCli;

import java.sql.SQLException;
import java.util.Scanner;

public class MembersProc {

	MembersDAO dao = new MembersDAO();
	Scanner sc = new Scanner(System.in);

	public void getMemberListProc() throws ClassNotFoundException, SQLException {
		System.out.println("                             <전체리스트>");
		System.out.println("============================================================================");
		System.out.println("reg.No\t  이름 \t\t주민번호\t연락처\t\t등록일");
		System.out.println("============================================================================");
		dao.getMemberList();
		System.out.println("============================================================================");
	}

	public void getMember() throws SQLException, ClassNotFoundException {
		System.out.println("조회할 번호를 입력하세요.");
		String sno = sc.nextLine();
		System.out.println("reg.No\t  이름 \t\t주민번호\t연락처\t\t등록일");
		System.out.println("============================================================================");
		dao.getMemberDTO(sno);
	}// end of getMember()

	public void insertProc() throws ClassNotFoundException, SQLException {
		System.out.println("이름을 입력하세요.");
		String sname = dao.inputCheck(sc);// sc.nextLine();
		System.out.println("주민번호를 입력하세요.");
		String sssn = dao.inputCheck(sc);// sc.nextLine();
		System.out.println("연락처를 입력하세요.");
		String sphone = dao.inputCheck(sc);// sc.nextLine();
		MemberDTO dto = new MemberDTO(sname, sssn, sphone);
		dao.insertMember(dto);
		getMemberListProc();
	}// end of insertProc()

	public void updateProc() throws ClassNotFoundException, SQLException {
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
		getMemberListProc();
	}// end of updateProc()

	public void deleteProc() throws SQLException, ClassNotFoundException {
		System.out.println("삭제할 번호를 선택하세요");
		String sno = sc.nextLine();
		System.out.println("sno==========" + sno);
		dao.deleteMember(sno);
		getMemberListProc();
	}// end of deleteProc()

}
