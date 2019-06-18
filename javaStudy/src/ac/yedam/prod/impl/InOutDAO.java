package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InOutDAO {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;
	String sql;

	private static InOutDAO singleton = new InOutDAO();

	private InOutDAO() {
	}

	public static InOutDAO getInstance() {
		return singleton;
	}
	
	

}
