package generic;

public class Person {
	private String name;

	Person() {

	}

	Person(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}

class Worker extends Person {
	private String company;

	Worker() {

	}

	Worker(String name, String company) {
		super();
		this.company = company;
	}

	public String getCompany() {
		return company;
	}
}

class Student extends Person {
	private String university;

	Student() {

	}

	Student(String name, String university) {
		super();
		this.university = university;
	}

	public String getUniversity() {
		return university;
	}
}

class HighStudent extends Student {
	private String highSchool;

	HighStudent() {

	}

	HighStudent(String name, String university, String highSchool) {
		super();
		this.highSchool = highSchool;
	}

	public String getHighSchool() {
		return highSchool;
	}
}
