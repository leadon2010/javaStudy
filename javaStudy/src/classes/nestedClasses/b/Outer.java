package classes.nestedClasses.b;

public class Outer {
	String field = "Outer-field";

	void method() {
		System.out.println("Outer-method");
	}

	class NestedClass {
		String field = "Nested-field";

		void method() {
			System.out.println("Nested-method");
		}

		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(Outer.this.field);
			Outer.this.method();
		}

	}

	// 사용제한
	void newMethod(final int num1, int num2) {
		final int local1 = 20;
		int local2 = 30;

		class LocalClass {
			void methodLocal() {
				System.out.println(local1 + ", " + local2 + ", " + num1 + ", " + num2);
			}
		}
		LocalClass lc = new LocalClass();
		lc.methodLocal();
	}

}
