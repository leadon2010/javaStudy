package memberCli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ShowValues {

	private static Connection conn = null;
	PreparedStatement pstmt = null;

	public void getConnection() throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "hr";

		// JDBC드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url, user, pw);
	}

	public void updateDTO(MemberDTO dto) throws ClassNotFoundException, SQLException {
		getConnection();
		int ord = 0;
		String sql = "update member01 set m_name=?, m_ssn=?, m_phone_no=?, m_regist_date=? where m_no=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(++ord, dto.getName());
		pstmt.setString(++ord, dto.getSsn());
		pstmt.setString(++ord, dto.getPhoneNum());
		pstmt.setString(++ord, dto.getRegistdate());
		pstmt.setString(++ord, dto.getNo());
		int r = pstmt.executeUpdate();
		System.out.println(r + " 건이 변경되었습니다.");

		conn.close();

	}///////// end of updateDTO

	public void insertDTO(MemberDTO dto) throws ClassNotFoundException, SQLException {

		getConnection();

		String sql = "insert into member01(m_no, m_name, m_ssn, m_phone_no, m_regist_date)"
				+ " values(?,?,?,?,sysdate)";

		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, dto.getNo());
		pstmt.setString(2, dto.getName());
		pstmt.setString(3, dto.getSsn());
		pstmt.setString(4, dto.getPhoneNum());
		int r = pstmt.executeUpdate();

		System.out.println(r + " 건 입력되었습니다.");
		conn.close();

	}///////// end of insertDTO

	public MemberDTO getMemberDTO(String m_no) throws ClassNotFoundException, SQLException {

		getConnection();

		String sql = "select m_no, m_name, m_ssn, m_phone_no, m_regist_date from member01 where m_no=?";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, m_no);
		ResultSet rs = pstmt.executeQuery();

		MemberDTO dtoResult = new MemberDTO();

		if (rs.next()) {
			dtoResult.setName(rs.getString("m_name"));
			dtoResult.setNo(rs.getString("m_no"));
			dtoResult.setPhoneNum(rs.getString("m_phone_no"));
			dtoResult.setRegistdate(rs.getString("m_regist_date"));
			dtoResult.setSsn(rs.getString("m_ssn"));
		} else {
			dtoResult.setName("-");
			dtoResult.setNo(m_no);
			dtoResult.setPhoneNum("-");
			dtoResult.setRegistdate("-");
			dtoResult.setSsn("-");
		}
		// conn.close();
		return dtoResult;

	}///////// end of getMemberDTO

	public List<MemberDTO> getMemberList() {
		List<MemberDTO> list = new ArrayList<>();
		MemberDTO dto = null;
		try {
			getConnection();
			String sql = "SELECT m.m_no ,m.m_name ,m.m_ssn ,m.m_phone_no ,m.m_regist_date FROM member01 m ORDER BY 1";
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new MemberDTO();
				dto.setName(rs.getString("m_name"));
				dto.setNo(rs.getString("m_no"));
				dto.setPhoneNum(rs.getString("m_phone_no"));
				dto.setRegistdate(rs.getString("m_regist_date"));
				dto.setSsn(rs.getString("m_ssn"));

				list.add(dto);
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;

	}/////// end of getMemberList

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		int cond = 3;

		ShowValues sv = new ShowValues();
		sv.getConnection();

		System.out.println("reg.No/\t    이름/\t\t주민번호/\t\t연락처/\t\t등록일/");
		System.out.println("============================================================================");

		if (cond == 1) {

			MemberDTO mt2 = new MemberDTO("name2", "sss2", "phone2");

			mt2.setNo("0001");
			mt2.setRegistdate("2018-07-01");
			// System.out.println(mt2.getInfo());
			// insertDTO(mt2);

			String sql = "select m_no from member01";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			List<Map<String, Object>> lists = new ArrayList<>();
			Map<String, Object> map = null;
			while (rs.next()) {
				map = new HashMap<>();
				map.put("no", rs.getString("m_no"));
				lists.add(map);
			}
			for (Map<String, Object> m : lists) {
				System.out.println(sv.getMemberDTO((String) m.get("no")) + " :" + m.get("no").getClass());
			}

		} else if (cond == 2) {

			MemberDTO dto = new MemberDTO("0002", "lch2", "721008-1789811", "010-8560-1636", "2018-09-09");
			sv.updateDTO(dto);
			sv.getMemberDTO("0001");

		} else if (cond == 3) {

			// 사용자입력을 받아서 한건 등록
			Scanner sc = new Scanner(System.in);
			System.out.println("번호를 입력하세요");
			String s_no = sc.nextLine();
			System.out.println("이름을 입력하세요");
			String s_name = sc.nextLine();
			System.out.println("주민번호를 입력하세요");
			String s_ssn = sc.nextLine();
			System.out.println("연락처를 입력하세요");
			String s_phone = sc.nextLine();

			MemberDTO dto = new MemberDTO(s_no, s_name, s_ssn, s_phone, "");

			sv.insertDTO(dto);

			List<MemberDTO> list = sv.getMemberList();
			for (MemberDTO d : list) {
				System.out.println(d);
			}

		}

	}///////// end of main

}
