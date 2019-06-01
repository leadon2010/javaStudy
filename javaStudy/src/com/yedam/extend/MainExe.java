package com.yedam.extend;

public class MainExe {
	public static void main(String[] args) {
		Parent parent = new ParentChild();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		ParentChild child = (ParentChild) parent;

		child.field2 = "data2";
		child.method3();
	}
}
