package memberCli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MembersDAO {

	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;

	public void getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "hr";
		// JDBC드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 오라클(DBMS)에 연결하여 Connection 객체 얻기.
		conn = DriverManager.getConnection(url, user, pw);
	}

	public void connClose() throws SQLException {
		if (conn != null)
			conn.close();

		if (pstmt != null)
			pstmt.close();

		if (rs != null)
			rs.close();
	}

	public void deleteMember(String m_no) throws SQLException {
		String sql = "delete from member01 where m_no=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, m_no);
		int r = pstmt.executeUpdate();
		System.out.println(r + " 건이 삭제되었습니다.");
	}

	public void updateMember(MemberDTO dto) throws SQLException, ClassNotFoundException {
		String sql = "update member01 set m_name=?, m_ssn=?, m_phone_no=?, m_regist_date=sysdate where m_no=? ";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getSsn());
		pstmt.setString(3, dto.getPhoneNum());
		pstmt.setString(4, dto.getNo());
		int r = pstmt.executeUpdate();
		System.out.println(r + " 건이 변경되었습니다.");
	}

	public void insertMember(MemberDTO dto) throws SQLException, ClassNotFoundException {
		String sql = "INSERT INTO member01 (m_no ,m_name ,m_ssn ,m_phone_no ,m_regist_date) "
				+ "VALUES ((select lpad(max(m_no)+1,4,'0') from member01) ,? ,? ,? ,sysdate)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getName());
		pstmt.setString(2, dto.getSsn());
		pstmt.setString(3, dto.getPhoneNum());
		int r = pstmt.executeUpdate();
		System.out.println(r + " 건이 입력되었습니다.");
	}

	public void getMemberList() throws SQLException, ClassNotFoundException {
		String sql = "select m.m_no ,m.m_name ,m.m_ssn ,m.m_phone_no ,m.m_regist_date from member01 m order by 1";
		pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		MemberDTO dto = null;
		List<MemberDTO> lists = new ArrayList<>();
		while (rs.next()) {
			dto = new MemberDTO();
			dto.setNo(rs.getString("m_no"));
			dto.setName(rs.getString("m_name"));
			dto.setSsn(rs.getString("m_ssn"));
			dto.setPhoneNum(rs.getString("m_phone_no"));
			dto.setRegistdate(rs.getString("m_regist_date"));
			// System.out.println(dto);
			lists.add(dto);
		}
		System.out.println("                             <전체리스트>");
		System.out.println("============================================================================");
		System.out.println("reg.No\t  이름 \t\t주민번호\t연락처\t\t등록일");
		System.out.println("============================================================================");
		for (MemberDTO s : lists) {
			System.out.println(s);
		}
		System.out.println("============================================================================");
	}

	public String inputCheck(Scanner scn) {
		String input = "";
		while (true) {
			input = scn.nextLine();
			System.out.println("input:::::" + input);
			if (!(input == null || input.replace(" ", "").equals("")))
				break;
			else {
				System.out.println("값을 입력해주세요.");
				System.out.println("==>");
			}
		}
		return input;
	}

}
