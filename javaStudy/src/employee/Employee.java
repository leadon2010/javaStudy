package employee;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private int salary;

	Employee(int id, String fn, String ln, int sal) {
		employeeId = id;
		firstName = fn;
		lastName = ln;
		salary = sal;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", salary=" + salary + "]";
	}

}
