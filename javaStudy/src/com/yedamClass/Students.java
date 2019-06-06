package com.yedamClass;

public class Students {
	// 필드. *) 변수와 필드의 차이점?
	String name;
	String sNo;
	String major;

	// 생성자.
	public Students() {

	}

	public Students(String name) {
		this.name = name;
	}
//	public Student(String name) {
//		this(name, "s2222", "korean");
//	}

	public Students(String name, String sNo) {
		this.name = name;
		this.sNo = sNo;
	}

	public Students(String name, String sNo, String major) {
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
