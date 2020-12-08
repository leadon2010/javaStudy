package streams.test.exam05;

public class Employee {
	int employeeId;
	String firstName;
	String hireDate;
	int departmentId;
	String jobId;
	int salary;

	public Employee(int employeeId, String firstName, String hireDate, int departmentId, String jobId, int salary) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.hireDate = hireDate;
		this.departmentId = departmentId;
		this.jobId = jobId;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getHireDate() {
		return hireDate;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public String getJobId() {
		return jobId;
	}

	public int getSalary() {
		return salary;
	}

}
