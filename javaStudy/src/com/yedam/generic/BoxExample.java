package com.yedam.generic;

public class BoxExample {
	public static void main(String[] args) {

		Box box = new Box();
		box.set("홍길동");
		String str = (String) box.get();
		System.out.println(str);

		box.set(new Apple());
		Apple apple = (Apple) box.get();
		System.out.println(apple);
	}
}
