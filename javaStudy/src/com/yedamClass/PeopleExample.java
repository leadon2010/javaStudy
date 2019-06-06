package com.yedamClass;

import java.util.Formatter;

class People {
	public String name;
	public String ssn;

	People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", ssn=" + ssn + "]";
	}

}

class Student extends People {
	private String major;

	Student(String name, String ssn) {
		super(name, ssn);
	}

	public Student(String name, String ssn, String major) {
		super(name, ssn);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		Formatter fm = new Formatter();
		fm.format("name= %s, ssn= %s, major= %s", name, ssn, major);
		return fm.toString();
	}

}

class Teacher extends People {
	private String studyClass;

	public Teacher(String name, String ssn) {
		super(name, ssn);
	}

	public Teacher(String name, String ssn, String studyClass) {
		super(name, ssn);
		this.studyClass = studyClass;
	}

	@Override
	public String toString() {
		Formatter fm = new Formatter();
		fm.format("name= %s, ssn= %s, studyClass= %s", name, ssn, studyClass);
		return fm.toString();
	}

}

public class PeopleExample {
	public static void main(String[] args) {

	}
}
