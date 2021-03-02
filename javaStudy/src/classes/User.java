package classes;

public class User {
	private String userName;
	private String group;
	private Book[] books;

	public User(String userName, String group, int bookCnt) {
		this.userName = userName;
		this.group = group;
		this.books = new Book[bookCnt];
	}

	public void userInfo() {
		System.out.println("이름:" + userName + ", 학급:" + group + ", 도서:" + getBookInfo());
	}

	public void addBook(Book book) {
		for (int i = 0; i < books.length; i++) {
			if (books[i] == null) {
				books[i] = book;
				break;
			}
		}
	}

	public String getBookInfo() {
		String books = "[";
		for (Book book : this.books) {
			if (book != null) {
				books += book.getTitle() + "-" + book.getAuthor() + "  ";
			}
		}
		books += "]";
		return books;
	}
}
