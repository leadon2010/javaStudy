package com.yedamClass.extendPkg;

public class AAA {
	// 필드
	public String name;

	// 생성자
	public AAA() {

	}

	public AAA(String name) {
		this.name = name;
	}

	// 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 자동타입변환과 다형성. 다형성은 같은 타입이지만 실행결과가 다른 다양한 객체를 이용할 수 있는 성질.
	// 부모클래스로 타입변환을 허용함(부품화가 가능함).
	// 부모클래스 <-(자동타입변환)- 자식클래스
	// ParentExample.java

}
