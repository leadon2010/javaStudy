package zzz;

public class Student {
	String name;
	String studentNo;
	String major;

	public Student(String name, String studentNo, String major) {
		super();
		this.name = name;
		this.studentNo = studentNo;
		this.major = major;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNo=" + studentNo + ", major=" + major + "]";
	}
}
