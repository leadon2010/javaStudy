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

// 자동타입변환이 일어난다...parent <- child.
public class ParentExample {
	public static void main(String[] args) {

		Parent parent = new Child();
		System.out.println(parent instanceof Child);
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		// parent.method3(); <== 에러발생.

		if (parent instanceof Child) {
			Child child = (Child) parent; // 갈제형변환.

			child.field2 = "data2";
			child.method3();
		}

		// 필드의 다형성..Car.java
	}
}
