package yoon.ch20;

import java.util.Arrays;

class Person implements Comparable {
	private String name;
	private int age;
	private int height;

	Person(String n, int a, int h) {
		name = n;
		age = a;
		height = h;
	}

	@Override
	public int compareTo(Object obj) {
		Person p = (Person) obj;
		return (this.name.compareTo(p.name));
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
	}

}

public class ArrayObjSort {

	public static void main(String[] args) {
		Person[] arr = new Person[3];
		arr[0] = new Person("LEE", 15, 170);
		arr[1] = new Person("KIM", 25, 180);
		arr[2] = new Person("PARK", 20, 185);
		Arrays.sort(arr);
		for (Person s : arr) {
			System.out.println(s);
		}
	}

}
