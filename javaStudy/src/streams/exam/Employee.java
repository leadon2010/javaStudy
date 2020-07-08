package streams.exam;

import java.sql.Date;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	Date hireDate;
	int salary;

	public Employee(int employeeId, String firstName, String lastName, Date hireDate, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hireDate = hireDate;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public int getSalary() {
		return salary;
	}
}