package thisisjava.nestedClass;

public class Outer {

	// instance class
	class B {
		B() {
			System.out.println("B객체가 생성됨.");
		}

		int fieldB;

		void methodB() {

			class E {
				E() {
					System.out.println("E객체가 생성됨");
				}

				int fieldE;

				void methodE() {
					System.out.println(fieldE + " methodE call.");
				}
			}
			E e = new E();
			e.fieldE = 5;
			e.methodE();
		}

	}

	// static class
	static class C {
		C() {
			System.out.println("C객체가 생성됨");
		}

		int fieldC;
		static int fieldCC;

		void methodC() {
			System.out.println(fieldC + " methodC call.");
		}

		static void methodCC() {
			System.out.println(fieldCC + " methodCC call.");
		}
	}

	// nested interface
	interface D {
		int fieldD = 4;

		void methodD();
	}

	void method() {
		class F {
			F() {
				System.out.println("F객체가 생성됨");
			}

			int fieldF;

			void methodF() {
				System.out.println(fieldF + " methodF call");
			}
		}
		F f = new F();
		f.fieldF = 6;
		f.methodF();
	}

}
