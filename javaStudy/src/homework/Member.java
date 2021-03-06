package homework;

public class Member {
	private String memberId;
	private String memberName;
	private Book[] rentBooks = new Book[3];

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public void rent(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] == null) {
				rentBooks[i] = book;
				break;
			}
		}
	}

	public void overdue(Book book) {
		for (int i = 0; i < rentBooks.length; i++) {
			if (rentBooks[i] != null && rentBooks[i].getBookTitle().equals(book.getBookTitle())) {
				rentBooks[i] = null;
				break;
			}
		}
	}

	public String getBookList() {
		String result = this.memberName;
		String rentList = "";
		for (int i = 0; i < this.rentBooks.length; i++) {
			if (rentBooks[i] != null)
				rentList = rentList + " / " + this.rentBooks[i].getBookTitle();
		}
		rentList = (rentList.equals("")) ? "대출된 정보가 없습니다" : rentList;
		return result + " 도서목록 : " + rentList;
	}
}
