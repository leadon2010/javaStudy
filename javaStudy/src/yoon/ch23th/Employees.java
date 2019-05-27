package yoon.ch23th;

public class Employees {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;

	Employees(int id, String fn, String ln, int sal) {
		employeeId = id;
		firstName = fn;
		lastName = ln;
		salary = sal;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (this.firstName == ((Employees) obj).firstName && this.lastName == ((Employees) obj).lastName)
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "Employees [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
