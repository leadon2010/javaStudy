package thisisjava.nestedClass;

public class Outer {

	class B {
		B() {
		}

		int field1;

		void method1() {

			class E {
				E() {
				}

				int field5;

				void method5() {
					System.out.println(field5 + " method5 call.");
				}
			}
			E e = new E();
			e.field5 = 5;
			e.method5();
		}

	}

	static class C {
		C() {
		}

		int field2;
		static int field3;

		void method2() {
			System.out.println(field2 + " method2 call.");
		}

		static void method3() {
			System.out.println(field3 + " method3 call.");
		}
	}

	interface D {
		int field4 = 4;
		void method4();
	}

}
