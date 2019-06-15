package employees.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import employees.Employees;

public class EmpDAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public void insertEmp(Employees e) {
		conn = DAO.getConnection();
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
		} finally {
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

	}// end of insertEmp

	public void updateEmp(Employees e) {
		conn = DAO.getConnection();
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
		} finally {
			DAO.close(conn);
		}

	}// end of updateEmp

	public Employees getEmp(int empl) {
		conn = DAO.getConnection();
		Employees emp = new Employees();

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
		} finally {
			DAO.close(conn);
		}
		return emp;
	}// end of getEmp

	public List<Employees> getEmpList() {
		conn = DAO.getConnection();
		List<Employees> list = new ArrayList<>();
		Employees emp;

		String sql = "SELECT * FROM employees WHERE employee_id > 200 ORDER BY 1 DESC";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employees();
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
		} finally {
			DAO.close(conn);
		}
		return list;
	}// end of getEmpList

}
