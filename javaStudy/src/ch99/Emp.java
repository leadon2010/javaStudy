package ch99;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Emp {
	public static void main(String[] args) {
		Emp emp = new Emp();

		List<EmployeeDTO> list = emp.getEmployeesList();
		for (EmployeeDTO dto : list)
			System.out.println(dto);
	}// end of main

	public List<EmployeeDTO> getEmployeesList() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		// return conn;
		List<EmployeeDTO> list = new ArrayList<>();
		EmployeeDTO dto = null;
		PreparedStatement pstmt = null;
		String sql = " select employee_id, first_name, last_name, email from employees";
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new EmployeeDTO();
				dto.setEmployeeId(rs.getString("employee_id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setEmail(rs.getString("email"));
				list.add(dto);
				// System.out.println(rs.getString("employee_id") + " / " +
				// rs.getString("first_name"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}// end of getEmployeesList

}
