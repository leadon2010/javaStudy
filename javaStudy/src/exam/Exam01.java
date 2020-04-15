package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Exam01 {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (ClassNotFoundException e4) {
			e4.printStackTrace();
		} catch (SQLException e4) {
			e4.printStackTrace();
		}

		List<Employee> list = new ArrayList<>();
		String sql = "select * from employees";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				list.add(new Employee(rs.getString("first_name"), rs.getInt("salary")));
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		list.stream().filter(e -> e.getSalary() >= 1000).sorted((a, b) -> a.compareTo(b))
				.forEach(s -> System.out.println(s.getFirstName() + ", " + s.getSalary()));
	}
}
