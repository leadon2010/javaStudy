package employees.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import employees.common.DAO;
import employees.model.Board;
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

	public List getDepartments() {
		String sql = "select * from board";
		List list = new ArrayList();

		try {
			conn = DAO.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				board.setParentNo(rs.getInt("parent_no"));
				list.add(board);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}

		return list;
	}

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
