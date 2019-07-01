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
		dao.insertBoard(board);
	}

	@Override
	public void updateBoard(Board board) {
		dao.updateBoard(board);
	}

	@Override
	public Board getBoard(int boardNo) {
		return dao.getBoard(boardNo);
	}

	@Override
	public List<Board> getBoardList() {
		return dao.getBoardList();
	}

	@Override
	public String checkLogin(String id, String pw) {
		return dao.checkLogin(id, pw);
	}

	@Override
	public List<Board> getReplyList(int boardNo) {
		return dao.getReplyList(boardNo);
	}

	@Override
	public void writeReply(Board board) {
		dao.writeReply(board);
	}

	@Override
	public boolean checkResponsibility(int no, String id) {
		return dao.checkResponsibility(no, id);
	}

	@Override
	public void deleteBoard(int boardNo) {
		dao.deleteBoard(boardNo);
	}

}
