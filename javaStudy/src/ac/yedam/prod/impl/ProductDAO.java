package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ac.yedam.prod.ProductVO;
import employees.common.DAO;

public class ProductDAO {
	Connection conn;
	ResultSet rs;
	PreparedStatement pstmt;
	String sql;

	private static ProductDAO singleton = new ProductDAO();

	private ProductDAO() {
	}

	public static ProductDAO getInstance() {
		return singleton;
	}

	public void insertProduct(ProductVO vo) {
		conn = DAO.getConnection();
		sql = "insert into yedam_product values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getProductCode());
			pstmt.setString(2, vo.getProductName());
			pstmt.setInt(3, vo.getProductPrice());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 입력됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}
}
