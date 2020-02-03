package thisisjava.lambda.examples;

public class UsingThis {
	public int outterField = 10;

	class Inner {
		int innerField = 20;

		void method() {
			MyFunctionalInterface fi = () -> {
				System.out.println("outterField : " + outterField);
				System.out.println("outterField : " + UsingThis.this.outterField + "\n");
				innerField = 22;

				System.out.println("innerField : " + innerField);
				innerField = 21;
				System.out.println("innerField : " + this.innerField);

			};
			fi.method();
		}
	}
}
