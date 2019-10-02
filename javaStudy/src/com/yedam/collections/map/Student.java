package com.yedam.collections.map;

public class Student {
	int sno;
	String name;

	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
//		return super.hashCode();
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (obj instanceof Student) {
			Student stud = (Student) obj;
			return sno == stud.sno && name.equals(stud.name);
		} else {
			return false;
		}
	}

}
