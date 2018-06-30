package humanResources;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class HumanDAO {

	private static Connection conn;

	private PreparedStatement pstmt;
	private CallableStatement cstmt;
	private ResultSet rs;

	public void deleteHuman(HumanDTO dto) {
		int r = 1;
		String sql = "delete from human_lists where h_no=?";
		try {
			conn = connect();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(r++, dto.gethNo());
			int a = pstmt.executeUpdate();
			System.out.println(a + " deleted.");

		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of deleteHuman

	public void updateHuman(HumanDTO dto) {
		int r = 1;
		String sql = "update human_lists set h_name=nvl(?, h_name), h_birth=nvl(?,h_birth), h_phone=nvl(?,h_phone), h_address=nvl(?,h_address), h_comments=nvl(?,h_comments) "
				+ "where h_no=?";
		try {
			conn = connect();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(r++, dto.gethName());
			pstmt.setString(r++, dto.gethBirth());
			pstmt.setString(r++, dto.gethPhone());
			pstmt.setString(r++, dto.gethAddress());
			pstmt.setString(r++, dto.gethComments());
			pstmt.setString(r++, dto.gethNo());
			int a = pstmt.executeUpdate();
			System.out.println(a + " updated.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of updateHuman

	public void insertHuman(HumanDTO dto) {

		int r = 1;
		String sql = "insert into human_lists(h_no, h_name, h_birth, h_phone, h_address, h_comments) "
				+ "values((select nvl(max(h_no),0)+1 from human_lists),?,?,?,?,?)";
		try {
			conn = connect();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(r++, dto.gethName());
			pstmt.setString(r++, dto.gethBirth());
			pstmt.setString(r++, dto.gethPhone());
			pstmt.setString(r++, dto.gethAddress());
			pstmt.setString(r++, dto.gethComments());
			int a = pstmt.executeUpdate();
			System.out.println(a + " inserted.");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end of insertHuman

	public List<HumanDTO> getHumanList() {
		List<HumanDTO> list = new ArrayList<HumanDTO>();
		HumanDTO dto = null;
		String sql = "select * from human_lists order by 1";

		try {
			conn = connect();

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new HumanDTO();
				dto.sethNo(rs.getString("h_no"));
				dto.sethName(rs.getString("h_name"));
				dto.sethBirth(rs.getString("h_birth"));
				dto.sethPhone(rs.getString("h_phone"));
				dto.sethAddress(rs.getString("h_address"));
				dto.sethComments(rs.getString("h_comments"));
				list.add(dto);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}

	public static Connection connect() throws Exception {

		// 접속정보
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "hr";
		String pw = "hr";

		// JDBC드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");

		conn = DriverManager.getConnection(url, user, pw);

		return conn;
	}

	public void close() {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (cstmt != null) {
			try {
				cstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (pstmt != null) {
			try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
