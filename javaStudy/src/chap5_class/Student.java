package chap5_class;

public class Student {
	String university = "Yedam";
	String name;
	String major;
	int studentNo;

	Student() {

	}

	Student(String name) {
		this.name = name;
	}

	Student(String name, String major) {
		this(name);
		this.major = major;
	}

	Student(String name, String major, int studentNo) {
		this(name, major);
		this.studentNo = studentNo;
	}

	void introduce() {
		System.out.println("My name is " + name + ", no is " + studentNo);
	}

	void study() {
		System.out.println("Study " + major);

	}

	void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}

	int getStudentNo() {
		return this.studentNo;
	}

}
