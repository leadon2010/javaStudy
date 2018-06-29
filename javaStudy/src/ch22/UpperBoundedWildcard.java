package ch22;

class Unboxer3 {
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

class UpperBoundedWildcard {
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(1234);

		Box<Double> dBox = new Box<>();
		dBox.set(10.009);

		Unboxer3.peekBox(iBox);
		Unboxer3.peekBox(dBox);
	}
}