package projectfx.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {
	Connection conn = null;;

	public EmpDAO() {
		conn = DAO.getConnect();
	}

	public List<Employee> getEmpList() {

		String sql = "select first_name, last_name, salary from employees";
		List<Employee> list = new ArrayList<>();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				list.add(new Employee(rs.getString("first_name"), rs.getString("last_name"), rs.getInt("salary")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DAO.disconnect(conn);
		}
		return list;

	}
}
