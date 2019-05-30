package com.yedam;

public class MainExe {
	public static void main(String[] args) {
		Student st = new Student("name1", "12345", "english");
		System.out.println(st.getName() + " " + st.getSsn() + " " + st.getMajor());
		// System.out.println(st.toString());
	}
}
