package thisisjava;

public class Calculator {
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	double avg(int x, int y) {
		int sum = plus(x, y);
		double result = sum / 2;
		return result;
	}

	void println(String str) {
		System.out.println(str);
	}

	void execute() {
		double result = avg(7, 10);
		println("실행결과: " + result);
	}

	////////////////////////////////////////////
	// 메소드 오버로딩
	////////////////////////////////////////////

	double areaRectangle(double width) {
		return width * width;
	}

	double areaRectangle(double width, double height) {
		return width * height;
	}

}
