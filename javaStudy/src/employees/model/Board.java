package employees.model;

public class Board {
	int boardNo;
	String title;
	String content;
	String writer;
	String creationDate;
	int parentNo;

	public int getBoardNo() {
		return boardNo;
	}

	public void setBoardNo(int boardNo) {
		this.boardNo = boardNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public int getParentNo() {
		return parentNo;
	}

	public void setParentNo(int parentNo) {
		this.parentNo = parentNo;
	}

	@Override
	public String toString() {
		return "Board [boardNo=" + boardNo + ", title=" + title + ", content=" + content + ", writer=" + writer
				+ ", creationDate=" + creationDate + ", parentNo=" + parentNo + "]";
	}

}
