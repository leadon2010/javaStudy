package ch27;

interface Calculator<T> {
	T cal(T a, T b);
}

class LambdaGeneric {
	public static void main(String[] args) {
		Calculator<Integer> ci = (a, b) -> {
			return a + b;
		};
		System.out.println(ci.cal(5, 6));
		Calculator<Double> cd = (a, b) -> {
			return a + b;
		};
		System.out.println(cd.cal(3.32, 4.53));
	}
}
