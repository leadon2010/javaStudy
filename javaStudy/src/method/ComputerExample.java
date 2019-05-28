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
		for (int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result;
	}
}

public class ComputerExample {
	public static void main(String[] args) {
		Computer comp = new Computer();
		System.out.println(comp.sum2(1, 2, 3, 4, 5));
	}
}
