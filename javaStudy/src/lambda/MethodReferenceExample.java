package lambda;

import java.util.function.IntBinaryOperator;

class Calculator {
	public static int staticMethod(int x, int y) {
		return x + y;
	}

	public int instanceMethod(int x, int y) {
		return x + y;
	}
}

//만약에 lambda식으로 표현을 안한다면 이렇게 interface를 구현하는 클래스를 만들어서 사용해야한다.
//아래 결과번외처럼 사용을 해야한다.
class IntBinaryOperatorClass implements IntBinaryOperator {

	@Override
	public int applyAsInt(int left, int right) {
		return left + right;
	}

}

public class MethodReferenceExample {
	public static void main(String[] args) {
		IntBinaryOperator operator;

		// 정적메소드 참조
		operator = (x, y) -> Calculator.staticMethod(x, y);
		System.out.println("결과1: " + operator.applyAsInt(1, 2));

		operator = Calculator::staticMethod;
		System.out.println("결과2: " + operator.applyAsInt(3, 4));

		Calculator calculator = new Calculator();
		operator = (x, y) -> calculator.instanceMethod(x, y);
		System.out.println("결과3: " + operator.applyAsInt(5, 6));

		operator = calculator::instanceMethod;
		System.out.println("결과4: " + operator.applyAsInt(7, 8));

		// 번외
		IntBinaryOperatorClass operatorClass = new IntBinaryOperatorClass();
		System.out.println("결과번외: " + operatorClass.applyAsInt(3, 4));
	}

}
