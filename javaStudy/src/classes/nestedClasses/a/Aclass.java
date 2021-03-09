package classes.nestedClasses.a;

public class Aclass {
	Aclass() {
		System.out.println("A instance created.");
	}

	class Bclass {
		int fieldB;
//		static int staticB;

		Bclass() {
			System.out.println("B instance created.");
		}

		void methodB() {
			System.out.println("methodB() call.");
		}
//		static void staticB() {
//			
//		}
	}

	static class Cclass {
		int fieldC;
		static int staticC;

		Cclass() {
			System.out.println("C instance created.");
		}

		void methodC() {
			System.out.println("methodC() call.");
		}

		static void staticC() {
			System.out.println("staticC() call.");
		}
	}

	void methodA() {
		class Dclass {
			Dclass() {
				System.out.println("D instance created.");
			}

			int fieldD;

//			static int staticD;
			void methodD() {
				System.out.println("methodD() call.");
			}
//			static void staticD() {
//				
//			}
		}
		Dclass d = new Dclass();
		d.fieldD = 4;
		d.methodD();
	}

}
