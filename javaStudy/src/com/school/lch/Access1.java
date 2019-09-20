package com.school.lch;

public class Access1 {
	public int field1;
	int field2;
	private int field3;

	public Access1() {
		method3();
	}

	Access1(int field3) {
		this.field3 = field3;
	}

	public void method1() {
		System.out.println("method1()");
	}

	void method2() {
		System.out.println("method2()");
	}

	private void method3() {
		System.out.println("method3()");
	}

}

class Access2 {
	int field;

	Access2() {

	}

	void method() {
		System.out.println("method()");
	}
}
