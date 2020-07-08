package streams.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Example03 {

	public static void main(String[] args) {
		Connection conn = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		} catch (Exception e) {
			e.printStackTrace();
		}

		List<Employee> list = new ArrayList<>();

		try {
			PreparedStatement pstmt = conn.prepareStatement("select * from employees");
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("last_name"), rs.getDate("hire_date"), rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		long cnt = list.stream().filter(s -> s.getFirstName().startsWith("S")).sorted(new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.firstName.compareTo(o2.firstName);
			}
		}).peek(s -> System.out.println(s.getEmployeeId() + ", " + s.getFirstName())).count();
		System.out.println("총 인원수: " + cnt);
	}

}
