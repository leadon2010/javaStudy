package ac.yedam.board.impl;

import java.util.List;

import ac.yedam.board.Board;
import ac.yedam.board.BoardService;

public class BoardServiceImpl implements BoardService {
	private static BoardServiceImpl service = new BoardServiceImpl();

	private BoardServiceImpl() {
	}

	public static BoardServiceImpl getInstance() {
		return service;
	}

	BoardDAO dao = BoardDAO.getInstance();

	@Override
	public void writeBoard(Board board) {

	}

	@Override
	public void updateBoard(Board board) {

	}

	@Override
	public Board getBoard(int boardNo) {
		return null;
	}

	@Override
	public List<Board> getBoardList() {
		return null;
	}

	@Override
	public String checkLogin(String id, String pw) {
		return dao.checkLogin(id, pw);
	}

}
