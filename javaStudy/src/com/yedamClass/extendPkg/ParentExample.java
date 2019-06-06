package com.yedamClass.extendPkg;

class Parent {
	public String field1;

	void method1() {
		System.out.println("parent method1");
	}

	void method2() {
		System.out.println("parent method2");
	}
}

class Child extends Parent {
	public String field2;

	@Override
	void method1() {
		System.out.println("child method1");
	}

	@Override
	void method2() {
		System.out.println("child method2");
	}

	void method3() {
		System.out.println("child method3");
	}

}

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		Parent paretn = new Parent();
		System.out.println(parent instanceof Child);
		System.out.println(paretn instanceof Parent);
		parent.field1 = "data1";
		parent.method1();
		parent.method2();

		if (parent instanceof Child) {
			Child child = (Child) parent;

			child.field2 = "data2";
			child.method3();
		}
	}
}
