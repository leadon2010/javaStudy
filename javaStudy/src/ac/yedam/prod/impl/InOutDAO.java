package ac.yedam.prod.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ac.yedam.prod.InOutVO;
import ac.yedam.prod.common.DAO;

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

	public void receiptProduct(InOutVO vo) {
		conn = DAO.getConnection();
		sql = "insert into yedam_prod_txn values(?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getProductCode());
			pstmt.setInt(2, vo.getTxnQty());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

	public void issueProduct(InOutVO vo) {
		conn = DAO.getConnection();
		sql = "insert into yedam_prod_txn values(?,?,sysdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getProductCode());
			pstmt.setInt(2, vo.getTxnQty());
			int r = pstmt.executeUpdate();
			System.out.println(r + " 건 입력.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
	}

	public List<InOutVO> onhandProduct(String productCode) {
		conn = DAO.getConnection();
		sql = "select product_code, onhand_qty from yedam_prod_onhand";// where product_code = nvl(?, product_code)";
		if (productCode != null && !productCode.equals(""))
			sql += " where product_code = '" + productCode + "'";
		List<InOutVO> list = new ArrayList<>();
		InOutVO vo = null;
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo = new InOutVO();
				vo.setProductCode(rs.getString("product_code"));
				vo.setOnhandQty(rs.getInt("onhand_qty"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.close(conn);
		}
		return list;
	}

}
