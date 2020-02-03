package thisisjava.referenceType;

public class StringExample {
	public static void main(String[] args) {
		String str1 = "John";
		String str2 = "John";

		if (str1 == str2) {
			System.out.println("동일한 참조값.");
		} else {
			System.out.println("다른 참조값.");
		}

		if (str1.equals(str2)) {
			System.out.println("동일한 내용.");
		} else {
			System.out.println("다른 내용.");
		}
		System.out.println("====================");

		String str3 = new String("James");
		String str4 = new String("James");

		if (str3 == str4) {
			System.out.println("동일한 참조값.");
		} else {
			System.out.println("다른 참조값.");
		}

		if (str3.equals(str4)) {
			System.out.println("동일한 내용.");
		} else {
			System.out.println("다른 내용.");
		}
	}

}
