package com.yedam;

import java.util.Formatter;

public class Student extends People {
	private String major;

	Student(String name, String ssn) {
		super(name, ssn);
	}

	public Student(String name, String ssn, String major) {
		super(name, ssn);
		this.major = major;
	}

	@Override
	public String toString() {
		Formatter fm = new Formatter();
		fm.format("name= %s, ssn= %s, major= %s", name, ssn, major);
		return fm.toString();
	}

}
