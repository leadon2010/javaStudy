package method;

class SingleTon {
	private static SingleTon st = new SingleTon();

	private SingleTon() {
	};

	static SingleTon getInstance() {
		return st;
	}

	void getSingleName() {
		System.out.println("singleton method");
	}
}

public class InstanceClass {
	public static void main(String[] args) {

		int a = 40, b = 33;
		int result = 0;
		if (a > b)
			result = a - b;
		else
			result = b - a;
		System.out.println(result);

		System.out.println(a > b ? (a - b) : (b - a));

		result = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0 && i % 7 == 0) {
				result += i;
				if (result < 100)
					continue;
				else if (i > 80)
					break;
				System.out.println(i + ",  " + result);
			}
		}
	}
}
