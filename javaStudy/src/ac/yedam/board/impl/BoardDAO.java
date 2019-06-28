package ac.yedam.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ac.yedam.board.Board;

public class BoardDAO {

	private static BoardDAO singleton = new BoardDAO();

	BoardDAO() {
	}

	public static BoardDAO getInstance() {
		return singleton;
	}

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	public void insertBoard(Board board) {
		
	}
}
