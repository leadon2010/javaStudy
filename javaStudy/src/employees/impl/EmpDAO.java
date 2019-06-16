package employees.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import employees.Employees;
import employees.common.DAO;

public class EmpDAO {

	private static EmpDAO dao = new EmpDAO();

	private EmpDAO() {
	}

	public static EmpDAO getInstance() {
		return dao;
	}

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public Set<String> getJob() {
		conn = DAO.getConnection();
		String sql = "select job_id from employees_temp";
		String job = null;
		TreeSet<String> set = new TreeSet<>();
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				job = rs.getString(1);
				set.add(job);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return set;
	}

	public void insertEmp(Employees e) {
		conn = DAO.getConnection();
		String sql = "INSERT INTO EMPLOYEES_temp (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, HIRE_DATE, JOB_ID, SALARY) "
				+ "VALUES ((SELECT MAX(EMPLOYEE_ID)+1 FROM EMPLOYEES_temp),?, ?, ?, SYSDATE, ?, ?)";
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
			DAO.close(conn);
		}

	}

	public void updateEmp(Employees e) {
		conn = DAO.getConnection();
		String sql = "UPDATE EMPLOYEES_temp SET FIRST_NAME=?, LAST_NAME=?, EMAIL=?, JOB_ID=?, SALARY=? WHERE EMPLOYEE_ID=?";
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

	}

	public Employees getEmp(int empl) {
		conn = DAO.getConnection();

		Employees emp = new Employees();

		String sql = "SELECT * FROM EMPLOYEES_temp WHERE EMPLOYEE_ID = ?";
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
	}

	public List<Employees> getEmpList() {
		conn = DAO.getConnection();

		List<Employees> list = new ArrayList<>();
		Employees emp;

		String sql = "SELECT * FROM EMPLOYEES_temp WHERE employee_id > 200 ORDER BY 1 DESC";
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
	}

	public void deleteEmp(int empId) {
		conn = DAO.getConnection();

		String sql = "delete from EMPLOYEES_temp where employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 삭제됨(deleted.)");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

}
