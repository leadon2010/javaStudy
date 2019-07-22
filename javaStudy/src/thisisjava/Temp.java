package thisisjava;

public class Temp {
	public static void main(String[] args) {
		int result = 0;
		result = sum(1, 3);
		System.out.println(result);
		result = sum(3, 5, 2);
		System.out.println(result);
		result = sum(4, 7, 2, 6);
		System.out.println(result);
	}

	static int sum(int... arg) {
		int result = 0;
		for (int i = 0; i < arg.length; i++) {
			result += arg[i];
		}
		return result;

	}
}
