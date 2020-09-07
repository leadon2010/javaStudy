package database.javafx;

public class Book {
	String bookTitle;
	String author;
	String press;
	String pressDate;
	int price;
	String isbn;

	public Book(String bookTitle, String author, String press, String pressDate, int price, String isbn) {
		super();
		this.bookTitle = bookTitle;
		this.author = author;
		this.press = press;
		this.pressDate = pressDate;
		this.price = price;
		this.isbn = isbn;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPress() {
		return press;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public String getPressDate() {
		return pressDate;
	}

	public void setPressDate(String pressDate) {
		this.pressDate = pressDate;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return "Book [bookTitle=" + bookTitle + ", author=" + author + ", press=" + press + ", pressDate=" + pressDate
				+ ", price=" + price + ", isbn=" + isbn + "]";
	}

}
