package thisisjava.nestedClass;

class Department {
	int departmentId;
	String departmentName;

	public Department(int departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}

class HumanResources {
	String company;
	Employee employee;

	HumanResources(String company, int empId, String firstName, String lastName, int deptId, String deptName) {
		Employee emp = new Employee(empId, firstName, lastName, 0);
	}

	class Employee {
		int employeeId;
		String firstName;
		String lastName;
		int salary;

		public Employee(int employeeId, String firstName, String lastName, int salary) {
			super();
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
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

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			this.salary = salary;
		}

	}
}

public class NestedClassSample {

}
