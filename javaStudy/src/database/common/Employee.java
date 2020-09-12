package database.common;

import java.time.LocalDate;

public class Employee {
	int employeeId;
	String firstName;
	String lastName;
	String email;
	LocalDate hireDate;
	Jobs jobId;
	int salary;

	public Employee(int employeeId, String firstName, String lastName, String email, LocalDate hireDate, Jobs jobId,
			int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.hireDate = hireDate;
		this.jobId = jobId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public Jobs getJobId() {
		return jobId;
	}

	public void setJobId(Jobs jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getInfo() {
		String str = String.format("{%s, %s, %s, %s}", firstName, lastName, email, salary);
		return str;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
				+ email + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary=" + salary + "]";
	}

}
