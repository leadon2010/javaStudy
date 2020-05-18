package classes.nestedClasses;

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

}
