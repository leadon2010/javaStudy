package chap5_class;

public class CalculatorExample {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.execute();

		int a = 10, b = 20;
		double result = Calculator.plus(12.3, b);
		cal.println("result: " + result);
		cal.println(result);
		cal.println(a);
	}
}
