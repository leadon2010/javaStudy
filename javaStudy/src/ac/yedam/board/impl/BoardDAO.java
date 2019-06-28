package ac.yedam.board.impl;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

	public void writeReply(Board board) {
		conn = DAO.getConnection();
		String sql = "{call board_pkg.write_reply(?,?,?)}";

		try {
			pstmt = conn.prepareCall(sql);
			pstmt.setString(1, board.getContent());
			pstmt.setString(2, board.getWriter());
			pstmt.setInt(3, board.getParentNo());
			pstmt.execute();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}

	}

	public List<Board> getReplyList(int boardNo) {
		conn = DAO.getConnection();
		String sql = "select * from board where parent_no = ? order by 1 desc";
		List<Board> list = new ArrayList<>();
		Board board = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreateDate(rs.getString("create_date"));
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

	public Board getBoard(int boardNo) {
		conn = DAO.getConnection();
		String sql = "select * from board where board_no = ?";
		Board board = null;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, boardNo);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreateDate(rs.getString("create_date"));
				board.setParentNo(rs.getInt("parent_no"));

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return board;
	}

	public List<Board> getBoardList() {
		conn = DAO.getConnection();
		String sql = "select * from board where parent_no is null order by board_no desc";
		List<Board> list = new ArrayList<>();
		Board board = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				board = new Board();
				board.setBoardNo(rs.getInt("board_no"));
				board.setTitle(rs.getString("title"));
				board.setContent(rs.getString("content"));
				board.setWriter(rs.getString("writer"));
				board.setCreateDate(rs.getString("create_date"));
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
		conn = DAO.getConnection();
		String sql = "{call write_board(?,?,?)";
		try {
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setString(1, board.getTitle());
			cstmt.setString(2, board.getContent());
			cstmt.setString(3, board.getWriter());
			cstmt.execute();
			System.out.println("procedure call.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}
}
