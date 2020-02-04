package employees.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import employees.common.DAO;
import employees.model.Departments;

public class DeptDAO {
	private static DeptDAO dept = new DeptDAO();

	private DeptDAO() {
	}

	public static DeptDAO getInstance() {
		return dept;
	}

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public Departments[] getDeptList() {
		String sql = "select * from departments";
		Departments[] departments = new Departments[100];
		int idx = 0;
		try {
			conn = DAO.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Departments dept = new Departments();
				dept.setDepartmentId(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				dept.setLocation_id(rs.getInt("location_id"));
				dept.setManagerId(rs.getInt("manager_id"));
				departments[idx++] = dept;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return departments;
	}

}
