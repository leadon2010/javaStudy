package ac.yedam.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ac.yedam.board.Board;
import ac.yedam.board.common.DAO;

public class BoardDAO {

	private static BoardDAO singleton = new BoardDAO();

	private BoardDAO() {
	}

	public static BoardDAO getInstance() {
		return singleton;
	}

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public String checkLogin(String id, String pw) {
		conn = DAO.getConnection();
		String sql = "select name from login_test where id=? and passwd = ?";
		String name = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				name = rs.getString("name");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return name;
	}

	public void insertBoard(Board board) {
		conn =DAO.getConnection();
		String sql = ""
	}
}
