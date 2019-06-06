package com.yedamClass;

import java.util.Formatter;

public class Teacher extends People {
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
