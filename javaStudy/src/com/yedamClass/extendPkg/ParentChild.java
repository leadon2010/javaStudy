package com.yedamClass.extendPkg;

public class ParentChild extends Parent {
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
