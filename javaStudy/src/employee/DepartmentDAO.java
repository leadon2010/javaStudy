package employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDAO {
	static Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;

	public static Connection getConn() {
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);

			System.out.println("Database에 연결되었습니다.\n");

		} catch (ClassNotFoundException cnfe) {
			System.out.println("DB 드라이버 로딩 실패 :" + cnfe.toString());
		} catch (SQLException sqle) {
			System.out.println("DB 접속실패 : " + sqle.toString());
		} catch (Exception e) {
			System.out.println("Unkonwn error");
			e.printStackTrace();
		}
		return conn;
	}// end of getConn()

	public void insert(Department d) {
		getConn();
		String sql = "insert into departments values(?,?,?,?)";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, d.getDepartmentId());
			pstmt.setString(2, d.getDepartmentName());
			pstmt.setInt(3, d.getManagerId());
			pstmt.setInt(4, d.getLocationId());
			int r = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateDept(Department d) {
		getConn();
		String sql = "update departments set department_name=?, manager_id=?, location_id=?"
				+ " where department_id=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, d.getDepartmentName());
			pstmt.setInt(2, d.getManagerId());
			pstmt.setInt(3, d.getLocationId());
			pstmt.setInt(4, d.getDepartmentId());
			int r = pstmt.executeUpdate();
			System.out.println(r+"건 수정되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public List<Department> selectAll() {
		getConn();
		String sql = "select d.department_id, d.department_name, d.manager_id, e.first_name , d.location_id, l.street_address "
				+ "from departments d join employees e " + "on d.manager_id = e.employee_id " + "join locations l "
				+ "on d.location_id = l.location_id";

		Department dpt;
		List<Department> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dpt = new Department();
				dpt.setDepartmentId(rs.getInt("department_id"));
				dpt.setDepartmentName(rs.getString("department_name"));
				dpt.setManagerId(rs.getInt("manager_id"));
				dpt.setManagerName(rs.getString("first_name"));
				dpt.setLocationId(rs.getInt("location_id"));
				dpt.setLocationName(rs.getString("street_address"));
				list.add(dpt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
}
