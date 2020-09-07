package database.javafx;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Book {
	SimpleStringProperty bookTitle;
	SimpleStringProperty author;
	SimpleStringProperty press;
	SimpleStringProperty pressDate;
	SimpleIntegerProperty price;
	SimpleStringProperty isbn;

	public Book(String bookTitle, String author, String press, String pressDate, int price, String isbn) {
		super();
		this.bookTitle = new SimpleStringProperty(bookTitle);
		this.author = new SimpleStringProperty(author);
		this.press = new SimpleStringProperty(press);
		this.pressDate = new SimpleStringProperty(pressDate);
		this.price = new SimpleIntegerProperty(price);
		this.isbn = new SimpleStringProperty(isbn);
	}

	public String getBookTitle() {
		return bookTitle.get();
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle.set(bookTitle);
	}

	public String getAuthor() {
		return author.get();
	}

	public void setAuthor(String author) {
		this.author.set(author);
	}

	public String getPress() {
		return press.get();
	}

	public void setPress(String press) {
		this.press.set(press);
	}

	public String getPressDate() {
		return pressDate.get();
	}

	public void setPressDate(String pressDate) {
		this.pressDate.set(pressDate);
	}

	public int getPrice() {
		return price.get();
	}

	public void setPrice(int price) {
		this.price.set(price);
	}

	public String getIsbn() {
		return isbn.get();
	}

	public void setIsbn(String isbn) {
		this.isbn.set(isbn);
	}

}
