package nested;

public class NestedClass {

	class InstanceClass {
		int instanceVar = 0;

		InstanceClass() {
			this.instanceVar = 100;
		}

		void instanceMethod() {
			System.out.println("this is instance method." + this.instanceVar);
		}

	}

	static class StaticClass {
		static int staticVar = 100;

		static void staticMethod() {
			System.out.println("this is static instance method." + staticVar);
		}
	}

	void localClassMethod() {
		class localClass {

			localClass() {
				int localVar = 0;

			}

		}
	}
}
