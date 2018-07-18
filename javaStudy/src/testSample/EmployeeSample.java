package testSample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeSample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);
		String sql = "select first_name, last_name, salary from employees";
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		Employees emp = null;// new Employees();
		List<Employees> list = new ArrayList<Employees>();
		while (rs.next()) {
			emp = new Employees();
			emp.setFirstName(rs.getString("first_name"));
			emp.setLastName(rs.getString("last_name"));
			emp.setSalary(rs.getInt("salary"));
			list.add(emp);
		}

		list.stream().filter(n -> n.getSalary() > 700).forEach(s -> System.out.println(s));

	}

}
