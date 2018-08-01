package ch16;

class ParentAdd {
	public int add(int a, int b) {
		return a + b;
	}
}

class ChildAdd extends ParentAdd {
	public double add(double a, double b) {
		System.out.println("덧셈을 진행합니다.");
		return a + b;
	}
}

public class OverrideMistake {
	public static void main(String[] args) {
		ParentAdd adder = new ChildAdd();
		System.out.println(adder.add(3, 4));
	}
}
