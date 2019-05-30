package com.yedam;

public class SingletonClass {
	private static SingletonClass single = new SingletonClass();

	private SingletonClass() {
	}

	public static SingletonClass getInstance() {
		return single;
	}
}
