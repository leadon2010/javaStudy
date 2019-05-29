package com.yedam;

class Person {
	private String name;
	private String phone;
	private int age;

	Person() {

	}

	Person(String name, String phone, int age) {
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}

	public void println() {
		System.out.printf("name is %s, phone is %s, age is %d \n", name, phone, age);
	}

}

public class ClassExe {
	public static void main(String[] args) {
		Person ps1 = new Person("aaa", "1111", 11);
		Person ps2 = new Person("bbb", "2222", 22);
		Person ps3 = new Person("ccc", "3333", 33);
		Person ps4 = new Person("ddd", "4444", 44);

		Person[] psAry = { ps1, ps2, ps3, ps4 };
		for (int i = 0; i < psAry.length; i++) {
			psAry[i].println();
		}

	}
}
