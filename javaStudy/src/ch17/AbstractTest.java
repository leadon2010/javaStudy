package ch17;

abstract class House {
	public void methodOne() {
		System.out.println("Method one");
	}

	public abstract void methodTwo();
}

class MyHouse extends House {

	@Override
	public void methodTwo() {
		System.out.println("Method Two");
	}

}

public class AbstractTest {
	public static void main(String[] args) {
		House hs = new MyHouse();
		hs.methodOne();
		hs.methodTwo();
	}
}
