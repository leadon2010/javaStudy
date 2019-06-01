package com.samplePkg;

class Employees {
	private String firstName;
	private String lastName;
	private int salary;
	private String department;

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getName() {
		return String.format("%s %s", getFirstName(), getLastName());
	}

	@Override
	public String toString() {
		return "[Name=" + firstName + " " + lastName + ", salary=" + salary + ", department= " + department + "]";
	}

}