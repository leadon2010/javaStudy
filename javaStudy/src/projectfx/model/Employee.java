package projectfx.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Employee {
	private SimpleStringProperty firstName;
	private SimpleStringProperty lastName;
	private SimpleIntegerProperty salary;

	public Employee(String firstName, String lastName, int salary) {
		this.firstName = new SimpleStringProperty(firstName);
		this.lastName = new SimpleStringProperty(lastName);
		this.salary = new SimpleIntegerProperty(salary);
	}

	public String getFirstName() {
		return firstName.get();
	}

	public void setFirstName(String firstName) {
		this.firstName.set(firstName);
	}

	public String getLastName() {
		return lastName.get();
	}

	public void setLastName(String lastName) {
		this.lastName.set(lastName);
	}

	public int getSalary() {
		return this.salary.get();
	}
	
	public void setSalary(int salary) {
		this.salary.set(salary);
	}

}
