package com.yedam.variablesAndTypes;

public class ArgsTest {
	public static void main(String[] args) {
		System.out.println("start");
		funs(1, 2, 3, 4, 5, 6, 7, 8);
		System.out.println("end");
	}

	public static void funs(int... a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}
