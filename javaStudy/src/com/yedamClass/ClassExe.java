package com.yedamClass;

import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		Person[] ary = new Person[5];
		while (true) {
			System.out.println("choose menu: 1(입력), 2(조회) ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				int row = checkRow(ary);
				if (row == 5) {
					System.out.println("no more data");
					break;
				}
				System.out.println("input value: [name][no][age]");
				String name = sc.next();
				String no = sc.next();
				int age = sc.nextInt();
				ary[row] = new Person(name, no, age);
				break;
			case 2:
				showHeader();
				showData(ary);
				break;
			default:
				System.out.println("프로그램 종료.");// System.exit(0);
				break;
			}
		}
	}// end of main

	static void showHeader() {
		System.out.print("===================================\n");
		System.out.print("name         phone          age\n");
		System.out.print("===================================\n");
	}

	static int checkRow(Person[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] == null)
				return i;
		}
		return ary.length;
	}

	static void showData(Person[] ary) {
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] != null)
				ary[i].println();
		}
		System.out.println();
	}

	static Person[] createData(int dataCnt) {
		int rowCnt = dataCnt;
		int charNum = 97;
		int charNo = 1;
		Person[] pAry = new Person[rowCnt];
		for (int i = 0; i < rowCnt; i++) {
			pAry[i] = new Person(getName(charNum++), getNo(charNo), charNo++ * 11);
		}
		return pAry;
	}

	static String getNo(int a) {
		String no = "";
		for (int i = 0; i < 5; i++) {
			no += a;
		}
		return no;
	}

	static String getName(int a) {
		String name = "";
		for (int i = 0; i < 5; i++) {
			name += (char) (a);
		}
		return name;
	}
}
