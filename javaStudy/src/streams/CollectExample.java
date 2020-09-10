package streams;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

import database.common.ConnectDB;
import database.common.Employee;
import database.common.Jobs;

public class CollectExample {
	public static void main(String[] args) {
		Connection conn = ConnectDB.getConnect();
		String sql = "select * from employees";
		List<Employee> list = new ArrayList<>();
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				Employee emp = new Employee(rs.getInt("employee_id"), rs.getString("first_name"),
						rs.getString("last_name"), rs.getString("email"), rs.getDate("hire_date").toLocalDate(),
						Jobs.valueOf(rs.getString("job_id")), rs.getInt("salary"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		List<Employee> newList = list.stream()//
				.filter(new Predicate<Employee>() {
					@Override
					public boolean test(Employee t) {
						return t.getJobId() == Jobs.IT_PROG;
					}
				}).collect(new Supplier<List<Employee>>() {
					@Override
					public List<Employee> get() {
						return new ArrayList<>();
					}
				}, new BiConsumer<List<Employee>, Employee>() {
					@Override
					public void accept(List<Employee> t, Employee u) {
						t.add(u);
					}
				}, new BiConsumer<List<Employee>, List<Employee>>() {
					@Override
					public void accept(List<Employee> t, List<Employee> u) {
						t.addAll(u);
					}
				});

		newList.stream()
				.forEach(s -> System.out.println(s.getFirstName() + "," + s.getLastName() + "," + s.getSalary()));

	}
}
