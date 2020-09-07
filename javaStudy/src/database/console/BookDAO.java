package database.console;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import database.common.ConnectDB;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BookDAO {
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public ObservableList<Book> getBookList() {
		conn = ConnectDB.getConnect();
		ObservableList<Book> books = FXCollections.observableArrayList();

		String sql = "select * from book";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Book book = new Book(rs.getString("book_title"), rs.getString("author"), rs.getString("press"),
						rs.getString("press_date"), rs.getInt("price"), rs.getString("isbn"));
				books.add(book);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return books;
	}
}
