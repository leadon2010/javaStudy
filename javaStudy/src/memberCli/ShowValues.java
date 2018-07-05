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

	}

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

	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ShowValues sv = new ShowValues();
		MemberDTO mt2 = new MemberDTO("name2", "sss2", "phone2");
		int cond = 1;

		System.out.println("reg.No\t  이름 \t\t주민번호\t\t연락처\t\t등록일");
		System.out.println("============================================================================");

		if (cond == 1) {

			mt2.setNo("0001");
			mt2.setRegistdate("2018-07-01");
			// System.out.println(mt2.getInfo());
			// insertDTO(mt2);

			sv.getConnection();
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

		}

	}

}
