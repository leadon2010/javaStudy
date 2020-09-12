package database.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	static Connection conn;
	static PreparedStatement pstmt;
	static ResultSet rs;

	public static List<Employee> getEmpList() {
		conn = ConnectDB.getConnect();
		List<Employee> list = new ArrayList<>();
		String sql = "select * from emp";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("last_name"), rs.getString("email"), rs.getDate("hire_date").toLocalDate(),
						Jobs.valueOf(rs.getString("job_id")), rs.getInt("salary"));
				list.add(emp);
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
		return list;
	}
}
