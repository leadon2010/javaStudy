package method;

class ParentAdder {
	public int add(int a, int b) {
		return a + b;
	}

}

class ChildAdder extends ParentAdder {
	public double add(double a, double b) {
		return a + b;
	}

	public double minus(double a, double b) {
		return a - b;
	}
}

public class MainMethod {
	public static void main(String[] args) {
		ParentAdder adder = new ChildAdder();
		System.out.println(adder.add(3, 6));
		ChildAdder ca = (ChildAdder) adder;
		System.out.println(ca.minus(3, 2));

	}
}
