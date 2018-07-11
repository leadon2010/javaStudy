package memberCli;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeesDAO {

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	public void getConnection() throws ClassNotFoundException, SQLException {

		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);
	}// end of getConnection

	public void insertEmployees(EmployeesDTO dto) throws ClassNotFoundException, SQLException {
		getConnection();
		int cnt = 0;
		String sql = "insert into employees(employee_id, first_name, last_name, email, hire_date, job_id) "
				+ "values((SELECT MAX(employee_id) + 1 FROM   employees), ?, ?, ?, ?, ?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(++cnt, dto.getFirstName());
		pstmt.setString(++cnt, dto.getLastName());
		pstmt.setString(++cnt, dto.getEmail());
		pstmt.setDate(++cnt, dto.getHireDate());
		pstmt.setString(++cnt, dto.getJobId());
		int r = pstmt.executeUpdate();
		System.out.println(r + " 건이 입력되었습니다.");
		conn.close();
	}

	public EmployeesDTO getEmployeeDTO(String emp_id) {
		EmployeesDTO dto = null;

		try {
			getConnection();
			String sql = "select employee_id, first_name, last_name, email, phone_number, hire_date"
					+ " from employees where employee_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, emp_id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dto = new EmployeesDTO();
				dto.setEmployeeId(rs.getInt("employee_id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhoneNumber(rs.getString("phone_number"));
				dto.setHireDate(rs.getDate("hire_date"));

				// System.out.println(dto);
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

		return dto;
	}// end of getEmployeesList

	public List<EmployeesDTO> getEmployeesList() {
		List<EmployeesDTO> list = new ArrayList<>();
		try {
			getConnection();
			String sql = "select employee_id, first_name, last_name, email, phone_number, hire_date"
					+ " from employees where rownum < 10 order by 1";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			EmployeesDTO dto = null;

			while (rs.next()) {
				dto = new EmployeesDTO();
				dto.setEmployeeId(rs.getInt("employee_id"));
				dto.setFirstName(rs.getString("first_name"));
				dto.setLastName(rs.getString("last_name"));
				dto.setEmail(rs.getString("email"));
				dto.setPhoneNumber(rs.getString("phone_number"));
				dto.setHireDate(rs.getDate("hire_date"));

				list.add(dto);

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return list;
	}// end of getEmployeesList

}
