package arrayList;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public static Connection getConnection() {
		Connection conn = null;
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			// System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}// end of getConnection

	public void insertEmp(Employee e) {
		conn = getConnection();
		String sql = "INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID, SALARY) "
				+ "VALUES ((SELECT MAX(EMPLOYEE_ID)+1 FROM EMPLOYEES),?, ?, ?, SYSDATE, ?, ?)";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(++cnt, e.getFirstName());
			pstmt.setString(++cnt, e.getLastName());
			pstmt.setString(++cnt, e.getEmail());
			pstmt.setString(++cnt, e.getJobId());
			pstmt.setInt(++cnt, e.getSalary());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 입력되었습니다.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}// end of insertEmp

	public void updateEmp(Employee e) {
		conn = getConnection();
		String sql = "UPDATE EMPLOYEES SET FIRST_NAME=?, LAST_NAME=?, EMAIL=?, JOB_ID=?, SALARY=? WHERE EMPLOYEE_ID=?";
		int cnt = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(++cnt, e.getFirstName());
			pstmt.setString(++cnt, e.getLastName());
			pstmt.setString(++cnt, e.getEmail());
			pstmt.setString(++cnt, e.getJobId());
			pstmt.setInt(++cnt, e.getSalary());
			pstmt.setInt(++cnt, e.getEmployeeId());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건이 수정되었습니다.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

	}// end of updateEmp

	public Employee getEmp(int empl) {
		conn = getConnection();
		Employee emp = new Employee();

		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empl);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));
				emp.setEmail(rs.getString("email"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return emp;
	}// end of getEmp

	public List<Employee> getEmpList() {
		conn = getConnection();
		List<Employee> list = new ArrayList<>();
		Employee emp;

		String sql = "SELECT * FROM employees WHERE employee_id > 200 ORDER BY 1 DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				emp.setJobId(rs.getString("job_id"));
				emp.setEmail(rs.getString("email"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}// end of getEmpList

}
