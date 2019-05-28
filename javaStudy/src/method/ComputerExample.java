package method;

class Computer {
	int sum1(int[] values) {
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result;
	}// end of sum1

	int sum2(int... values) {
		int result = 0;
		for (int a : values) {
			result += a;
		}
		return result;
	}
}

class Television {
	static String company = "Kakao";
	static String department = "Develop";
	static String member;
	static {
		member = company + "-" + department;
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer comp = new Computer();
		int[] ary = { 2, 3, 4, 5, 6 };
		System.out.println(comp.sum1(ary));
		System.out.println(comp.sum2(1, 2, 3, 4, 5));
		System.out.println(Television.member);
	}
}
