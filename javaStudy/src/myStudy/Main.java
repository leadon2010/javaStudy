package myStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	private String department;

	public Employee() {

	}

	public Employee(String firstName, String lastName, double salary, String department) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.department = department;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	// return Employee's first and last name combined
	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	@Override
	public String toString() {
		// return "Employee [firstName=" + firstName + ", lastName=" + lastName + ",
		// salary=" + salary + ", department=" + department + "]";
		String str = "==================================================\n";
		str.replace("=", "-");
		return String.format("%-8s %-8s %8.2f   %s", firstName, lastName, salary, department);
	}

}

public class Main {

	public static void main(String[] args) {
		Employee[] employees = { new Employee("J", "Red", 51000, "IT"), new Employee("A", "Green", 71600, "IT"),
				new Employee("M", "Black", 35187.5, "Sales"), new Employee("K", "Yellow", 47100.77, "Marketing"),
				new Employee("L", "Pink", 62001, "IT"), new Employee("D", "Blue", 32001, "Sales"),
				new Employee("W", "Brown", 42361.4, "Marketing") };
		// List<Employee> list = Arrays.asList(employees);

		/////////////////////////////////////////////
		List<Employee> list = new ArrayList<>();
		Connection conn = null;
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			conn = DriverManager.getConnection(url, user, pw);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		Employee emp = null;
		String sql = "select first_name, last_name, salary, (select department_name from departments d where d.department_id = e.department_id ) as department "
				+ "from employees e where e.department_id is not null and rownum < 100";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				emp = new Employee();
				emp.setFirstName(rs.getString("first_name"));
				emp.setLastName(rs.getString("last_name"));
				emp.setSalary(rs.getDouble("salary"));
				emp.setDepartment(rs.getString("department"));
				list.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/////////////////////////////////////////////

		// display all Employees
		System.out.println("Complete Employee list:");
		list.stream().forEach(System.out::println);

		// group Employees by department
		System.out.printf("%nEmployees by department:%n");
		Map<String, List<Employee>> groupedByDepartment = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		groupedByDepartment.forEach((department, employeesInDepartment) -> {
			System.out.println(department);
			System.out.println("========================================");
			employeesInDepartment.forEach(employee -> System.out.printf(" %s%n", employee));
			System.out.println("========================================");
		});

	}// end of main
}
/*

*/