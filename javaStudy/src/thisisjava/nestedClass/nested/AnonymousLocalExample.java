package thisisjava.nestedClass.nested;

interface Calculatable {
	public int sum();
}

class Anonymous {
	private int field;

	public void method(final int arg1, int arg2) {
		final int var1 = 0;
		int var2 = 0;

		field = 10;

//		arg1 = 10;
//		arg2 = 20;

//		var1 = 30;
//		var2 = 40;

		Calculatable calc = new Calculatable() {
			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2;
				return result;
			}
		};
		System.out.println(calc.sum());
	}
}

public class AnonymousLocalExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		anony.method(0, 0);
	}
}
