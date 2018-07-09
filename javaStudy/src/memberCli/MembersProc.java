package memberCli;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import jxl.Workbook;
import jxl.format.Alignment;
import jxl.format.Colour;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

public class MembersProc {

	MembersDAO dao = new MembersDAO();
	Scanner sc = new Scanner(System.in);

	public void getMemberListProc() throws ClassNotFoundException, SQLException {
		System.out.println("                             <전체리스트>");
		System.out.println("============================================================================");
		System.out.println("reg.No\t  이름 \t\t주민번호\t\t연락처\t\t등록일");
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

	public void exportExcel() throws IOException, WriteException, ClassNotFoundException, SQLException {
		WritableWorkbook workbook = Workbook.createWorkbook(new File("newWork.xls"));
		WritableSheet sheet = workbook.createSheet("first", 0);
		WritableCellFormat wcf = new WritableCellFormat();
		wcf.setAlignment(Alignment.CENTRE);
		wcf.setBackground(Colour.GOLD);
		WritableFont arial10Bold = new WritableFont(WritableFont.ARIAL, 10, WritableFont.BOLD);
		wcf.setFont(arial10Bold);

		// cell의 사이즈 지정
		sheet.setColumnView(0, 20);
		sheet.setColumnView(1, 20);
		sheet.setColumnView(2, 20);
		sheet.setColumnView(3, 20);
		sheet.setColumnView(4, 20);

		// 셀라벨 지정
		sheet.addCell(new Label(0, 0, "regNo", wcf));
		sheet.addCell(new Label(1, 0, "이름", wcf));
		sheet.addCell(new Label(2, 0, "주민번호", wcf));
		sheet.addCell(new Label(3, 0, "연락처", wcf));
		sheet.addCell(new Label(4, 0, "등록일", wcf));

		List<MemberDTO> list = dao.getMemberList();
		// 셀값 셋팅
		int j = 1;
		for (MemberDTO a : list) {
			Label lblNo = new Label(0, j, a.getNo());
			Label lblName = new Label(1, j, a.getName());
			Label lblSsn = new Label(2, j, a.getSsn());
			Label lblPhone = new Label(3, j, a.getPhoneNum());
			Label lblRegist = new Label(4, j, a.getRegistdate());

			sheet.addCell(lblNo);
			sheet.addCell(lblName);
			sheet.addCell(lblSsn);
			sheet.addCell(lblPhone);
			sheet.addCell(lblRegist);
			
			j++;
		}
		workbook.write();
		workbook.close();
		System.out.println("completed.");
	}
}
