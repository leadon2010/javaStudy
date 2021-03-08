package interfaces.board;

public interface Service {
	public Board[] getBoardList();

	public Board getBoard(int boardNo);

	public void createBoard(Board board);

	public void modifyBoard(Board board);

	public void removeBoard(Board board);
}
