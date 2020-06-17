package stream.intermediate;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Employee {
	public static enum Gender {
		MALE, FEMALE;
	}

	private long id;
	private String name;
	private Gender gender;
	private LocalDate dateOfBirth;
	private double income;

	public Employee(long id, String name, Gender gender, LocalDate dateOfBirth, double income) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.income = income;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public boolean isMale() {
		return this.gender == Gender.MALE;
	}

	public boolean isFemale() {
		return this.gender == Gender.FEMALE;
	}

	@Override
	public String toString() {
		String str = String.format("(%s, %s, %s, %s, %.2f)", id, name, gender, dateOfBirth, income);
		return str;
	}

	public static List<Employee> persons() {
		Employee p1 = new Employee(1, "Hong", Gender.MALE, LocalDate.of(1991, Month.JANUARY, 1), 2343.0);
		Employee p2 = new Employee(2, "Hwang", Gender.MALE, LocalDate.of(1992, Month.JULY, 21), 7100.0);
		Employee p3 = new Employee(3, "Choi", Gender.FEMALE, LocalDate.of(1993, Month.MAY, 29), 5455.0);
		Employee p4 = new Employee(4, "Park", Gender.MALE, LocalDate.of(1994, Month.OCTOBER, 16), 1800.0);
		Employee p5 = new Employee(5, "Kim", Gender.FEMALE, LocalDate.of(1995, Month.DECEMBER, 13), 1234.0);
		Employee p6 = new Employee(6, "Ryu", Gender.MALE, LocalDate.of(1996, Month.JUNE, 9), 3211.0);
		List<Employee> persons = Arrays.asList(p1, p2, p3, p4, p5);
		return persons;
	}

}