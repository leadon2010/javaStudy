package interfaces.board;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardDAO {
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;

	public void close() {

		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	public Board[] selectBoards() {
		conn = DBCon.getConnect();
		Board[] boards = new Board[100];
		String sql = "select * from boards";
		try {
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			int i = 0;
			while (rs.next()) {
				Board board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreationDate(rs.getString("creation_date"));
				boards[i] = board;
				i++;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return boards;
	}

	public Board selectBoard(int boardNo) {
		conn = DBCon.getConnect();
		return null;
	}

	public void insertBoard(Board board) {

	}

	public void updateBoard(Board board) {

	}

	public void deleteBoard(Board board) {

	}
}
