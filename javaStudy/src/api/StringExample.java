package api;

public class StringExample {
	public static void main(String[] args) {

		showGender("990205-1234567");
		showGender("990205/3234567");
		showGender("990205*2234567");
		showGender("9902054234567");

	}

	public static void showGender(String str) {
		String[] exp = { "-", "/", "*" };
		String newStr = str;
		for (int i = 0; i < exp.length; i++) {
			newStr = newStr.replace(exp[i], "");
		}

		if (newStr.charAt(6) == '1' || newStr.charAt(6) == '3') {
			System.out.println("번호 " + str + "은 남자번호입니다.");
		} else {
			System.out.println("번호 " + str + "은 여자번호입니다.");
		}
	}

	public static void showGender1(String str) {
		String[] exp = { "-", "/", "*" };
		int locationAt = 6;
		for (int i = 0; i < exp.length; i++) {
			locationAt = str.indexOf(exp[i]);
			if (locationAt != -1)
				break;
		}

		if (str.substring(locationAt + 1).startsWith("1") || str.substring(locationAt + 1).startsWith("3")) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}
}
