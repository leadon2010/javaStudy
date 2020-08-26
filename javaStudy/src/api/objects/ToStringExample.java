package api.objects;

import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		String str1 = "Hong";
		String str2 = null;

		System.out.println(Objects.toString(str1));

		System.out.println(Objects.toString(str2, "Null입니다"));
		
		
		printIt(str2, "Null");
	}

	public static void printIt(Object obj, String defaultValue) {
		if (obj == null) {
			System.out.println(defaultValue);
			return;
		}
		System.out.println(Objects.toString(obj));
	}
}
