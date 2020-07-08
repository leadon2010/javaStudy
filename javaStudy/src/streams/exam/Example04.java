package streams.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class Example04 {
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

		int result = list.stream()//
				.filter(new Predicate<Employee>() {
					public boolean test(Employee t) {
						return t.getSalary() < 5000;
					};
				}).sorted(new Comparator<Employee>() {
					@Override
					public int compare(Employee o1, Employee o2) {
						return o1.getSalary() - o2.getSalary();
					}
				}).peek(s -> System.out.println(s.getSalary() + ", " + s.getFirstName())) //

//				.flatMapToInt(new Function<Employee, IntStream>() {
//					@Override
//					public IntStream apply(Employee t) {
//						return IntStream.of(t.getSalary());
//					}
//				}).sum();

				.reduce(0, new BiFunction<Integer, Employee, Integer>() {
					@Override
					public Integer apply(Integer t, Employee u) {
//						System.out.println("2=>" + t + ", " + u.getFirstName());
						return Integer.sum(t, u.getSalary());
					}
				}, new BinaryOperator<Integer>() {
					@Override
					public Integer apply(Integer t, Integer u) {
//						System.out.println("1=>" + t + ", " + u);
						return 0;
					}
				});

		System.out.println("급여합계: " + result);

	}
}
