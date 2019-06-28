package ac.yedam.board;

import java.util.List;

public interface BoardService {
	public void writeBoard(Board board);

	public void updateBoard(Board board);

	public Board getBoard(int boardNo);

	public List<Board> getBoardList();
}
