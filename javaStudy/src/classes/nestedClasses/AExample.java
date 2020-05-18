package classes.nestedClasses;

class A {
	A() {
		System.out.println("A객체가 생성됨");
	}

	// 인스턴스 멤버 클래스.
	class B {
		B() {
			System.out.println("B객체가 생성됨");
		}

		int field1;
//		static int field2;

		void method1() {
			System.out.println("method1() call. field1 = " + field1);
		}

//		static void method2() {
//			System.out.println("method2() call.");
//		}
	}

	// 정적 멤버 클래스.
	static class C {
		C() {
			System.out.println("c객체가 생서됨.");
		}

		int field1;
		static int field2;

		void method1() {
			System.out.println("method1() call. field1 = " + field1);
		}

		static void method2() {
			System.out.println("method2() call. field2 = " + field2);
		}
	}

	// 로컬 클래스.
	void localMethod() {
		class D {
			D() {
				System.out.println("D객체가 생성됨.");
			}

			int field1;
//			static int field2;

			void method1() {
				System.out.println("method1() call. field1 = " + field1);
			}

//			static void method2() {
//				System.out.println("method6() call.");
//			}
		}
		D d = new D();
		d.field1 = 5;
		d.method1();
	}
}

public class AExample {
	public static void main(String[] args) {
		A a = new A();

		A.B b = a.new B();
		b.field1 = 1;
		b.method1();

		A.C c = new A.C();
		c.field1 = 2;
		c.method1();

//		c.field2 = 3;
//		c.method2();

		A.C.field2 = 4;
		A.C.method2();

		a.localMethod();

	}
}
