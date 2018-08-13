package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeListProc {
	static Connection conn = null;

	public static void main(String[] args) {

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

		// emp 데이터 한건 생성.
		Scanner sc = new Scanner(System.in);
		System.out.println("사용자ID를 입력하세요.");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("lastName을 입력하세요.");
		String l = sc.nextLine();
		System.out.println("fistName을 입력하세요.");
		String f = sc.nextLine();
		System.out.println("salary을 입력하세요.");
		int s = sc.nextInt();
		sc.nextLine();

		EmployeeListProc prc = new EmployeeListProc();
		prc.getEmpList(f);

	} // end of main

	void updateEmp(String f, String l, int s, int id) {
		String sql = "update employees set first_name =? ,last_name = ? ,salary = ? " + "where employee_id = ?";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, f);
			pstmt.setString(2, l);
			pstmt.setInt(3, s);
			pstmt.setInt(4, id);

			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건 수정되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void insertEmp(Employee e) {
		String sql = "insert into employees (employee_id, last_name, email, hire_date, job_id) "
				+ " values(?, ?, ?, sysdate, ?) ";
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEmployeeId());
			pstmt.setString(2, e.getLastName());
			pstmt.setString(3, e.getEmail());
			pstmt.setString(4, e.getJobId());

			int rs = pstmt.executeUpdate();
			System.out.println(rs + "건 입력되었습니다.");
		} catch (Exception em) {
			em.printStackTrace();
		}
	}

	void getEmp(String name) {
		String sql = "select employee_id, first_name, last_name, salary from employees  " 
		           + "where first_name ='" + name + "'";
		// System.out.println(sql);
		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			Employee emp = new Employee();
			if (rs.next()) {
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				System.out.println(emp);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void getEmpList(String name) {
		String sql = "select employee_id, first_name, last_name, salary from employees"
				+ " where first_name like '%'||?||'%' ";
		PreparedStatement pstmt;
		ResultSet rs;
		Employee emp;
		List<Employee> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setEmployeeId(rs.getInt("employee_id"));
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		for (Employee e : list) {
			System.out.println(e);
		}
	}// end of getEmpList
}// end of class
