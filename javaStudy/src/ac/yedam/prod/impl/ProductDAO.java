package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ac.yedam.prod.ProductVO;
import ac.yedam.prod.common.DAO;

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

	public void updateProduct(ProductVO vo) {
		conn = DAO.getConnection();
		sql = "update yedam_product set product_price = ? where product_code = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, vo.getProductPrice());
			pstmt.setString(2, vo.getProductCode());
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 변경됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

	public List<ProductVO> getProductList(String productCode) {
		conn = DAO.getConnection();
		sql = "select product_code, product_name, product_price from yedam_product ";
		if (productCode != null && !productCode.equals(""))
			sql += " where product_code = ?";
		sql += " order by 1";
		ProductVO vo = null;
		List<ProductVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			if (productCode != null && !productCode.equals(""))
				pstmt.setString(1, productCode);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new ProductVO();
				vo.setProductCode(rs.getString("product_code"));
				vo.setProductName(rs.getString("product_name"));
				vo.setProductPrice(rs.getInt("product_price"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return list;
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
