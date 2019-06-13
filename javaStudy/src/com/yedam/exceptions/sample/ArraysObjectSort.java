package com.yedam.exceptions.sample;

import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Object obj) {
		Person pobj = (Person) obj;
//		return this.name.length() - pobj.name.length();
		return this.name.compareTo(pobj.name);

//		if (this.age < ((Person) obj).age)
//			return -1;
//		else if (this.age > ((Person) obj).age)
//			return 1;
//		else
//			return 0;
	}

}

public class ArraysObjectSort {
	public static void main(String[] args) {
		int[] arr1 = { 1, 5, 3, 2, 4 };
		double[] arr2 = { 3.3, 2.2, 6.6, 4.4, 1.1 };

		Arrays.sort(arr1);
		for (int i : arr1)
			System.out.println(i);

		Arrays.sort(arr2);
		for (double d : arr2)
			System.out.println(d);

		// Person[] 의 크기 비교??
		Person p1 = new Person("aacc", 10);
		Person p2 = new Person("bbb", 12);
		Person p3 = new Person("aabbb", 20);
		Person[] pAry = { p1, p2, p3 };

		Arrays.sort(pAry);
		for (Person p : pAry)
			System.out.println(p);
	}
}