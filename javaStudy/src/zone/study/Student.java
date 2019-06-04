package zone.study;

public class Student {
	// 필드.
	private String name;
	private String sNo;
	private String major;

	// 생성자.
	Student() {

	}

	public Student(String name, String sNo, String major) {
		super();
		this.name = name;
		this.sNo = sNo;
		this.major = major;
	}

	// 메소드.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getsNo() {
		return sNo;
	}

	public void setsNo(String sNo) {
		this.sNo = sNo;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void getStudentInfo() {
		System.out.println("이름: " + name + ", 학번: " + sNo + ", 전공: " + major);
	}
}
