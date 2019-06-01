package com.yedam.extend;

public class MainExe {
	public static void main(String[] args) {
		Parent parent = new ParentChild();
		Parent paretn = new Parent();
		System.out.println(parent instanceof ParentChild);
		System.out.println(paretn instanceof Parent);
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		if (parent instanceof ParentChild) {
			ParentChild child = (ParentChild) parent;

			child.field2 = "data2";
			child.method3();
		}
	}
}
