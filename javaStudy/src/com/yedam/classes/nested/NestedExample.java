package com.yedam.classes.nested;

class Outer {
	Outer() {
		System.out.println("Outer Constructor");
	}

	class InnerInstance {
		int field;

		InnerInstance() {
			System.out.println("Instance Inner Constructor");
		}

		void method() {
			System.out.println("InnerInstance method called.");
		}
	}

	static class InnerStatic {
		int field1;
		static int field2;

		InnerStatic() {
			System.out.println("Static Inner Constructor");
		}

		void method1() {
			System.out.println("InnerStatic instance method called.");
		}

		static void method2() {
			System.out.println("InnerStatic static method called.");
		}
	}

	void localMethod() {
		class LocalClass {
			int field1;

			LocalClass() {
				System.out.println("LocalClass Constructor");
			}

			void method() {
				System.out.println("LocalClass method called.");
			}
		}
		LocalClass lc = new LocalClass();
		lc.field1 = 10;
		lc.method();
	}

}

public class NestedExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.InnerInstance oii = outer.new InnerInstance();
		oii.method();
		Outer.InnerStatic oi = new Outer.InnerStatic();
		oi.method1();
		Outer.InnerStatic.method2();
		outer.localMethod();
	}
}
