package com.school.lch;

public class AccessExample {
	public static void main(String[] args) {
		Access1 acc1 = new Access1();
		acc1.field1 = 10;
		acc1.method1();
		acc1.method2();

		Access2 acc2 = new Access2();
		acc2.field = 10;
		acc2.method();
	}

}
