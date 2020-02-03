package thisisjava.exception.sample;

import java.util.Arrays;

class Member implements Comparable {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + " : " + age;
	}

	@Override
	public int compareTo(Object o) {
		Member m = (Member) o;
		return this.name.compareTo(m.name);
//		return this.age - m.age;
//		return 0;
	}
}

public class ArraySearch {
	public static void main(String[] args) {
		int[] ar = { 33, 44, 22, 66, 55 };
		Arrays.sort(ar);
		for (int i : ar)
			System.out.println(i);

		int idx = Arrays.binarySearch(ar, 66);
		System.out.println("index of 22: " + idx);
		System.out.println();

		// Member class ???
		Member m1 = new Member("charles", 20);
		Member m2 = new Member("johnson", 25);
		Member m3 = new Member("jane", 30);
		Member m4 = new Member("jamy", 17);
		Member[] mAry = { m1, m2, m3, m4 };
		Arrays.sort(mAry);
		for (Member m : mAry)
			System.out.println(m);
		int ids = Arrays.binarySearch(mAry, new Member("charles", 17));
		System.out.println(ids);
	}
}
