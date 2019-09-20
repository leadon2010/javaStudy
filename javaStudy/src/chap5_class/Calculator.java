package chap5_class;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int a, int b) {
		int sum = plus(a, b);
		double avg = sum / 2;
		return avg;
	}

	void execute() {
		int a = 10, b = 20;
		double result = avg(a, b);
		println("result : " + result);
	}

	void println(String str) {
		System.out.println(str);
	}

	void println(double str) {
		System.out.println(str);
	}

	void println(int str) {
		System.out.println(str);
	}

	static double plus(double x, double y) {
		double result = x + y;
		return result;
	}

	static double minus(double x, double y) {
		double result = x - y;
		return result;
	}

	static double multi(double x, double y) {
		return x * y;
	}

	static double div(double x, double y) {
		return x / y;
	}
}
