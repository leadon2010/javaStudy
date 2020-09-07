package database.console;

import java.util.List;

public class BookMain {
	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		List<Book> books = dao.getBookList();
		for (Book book : books) {
			System.out.println(book);
		}
	}
}
