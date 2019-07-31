package thisisjava.nestedClass.tutorials;

class OuterClass {

	class NestedClass {

	}
}

class OuterClass1 {
	
	static class StaticNestedClass {

	}

	class InnerClass {

	}
}

// Shadowing
class ShadowTest {
	public int x = 0;

	class FirstLevel {
		public int x = 1;

		void methodInFirstLevel(int x) {
			System.out.println("x = " + x);
			System.out.println("this.x = " + this.x);
			System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
		}
	}
}

// 1. It is a way of logically grouping classes that are only used in one place
// 2. It increases encapsulation
// 3. It can lead to more readable and maintainable code

public class NestedClasses {
	public static void main(String[] args) {

		// 1. StaticNestedClass, InnerClass Constructor()
		OuterClass1 outer = new OuterClass1();
		OuterClass1.InnerClass inner = outer.new InnerClass();

		OuterClass1.StaticNestedClass staticNestedClass = new OuterClass1.StaticNestedClass();

		// 2. shadowing
		ShadowTest st = new ShadowTest();
		ShadowTest.FirstLevel f1 = st.new FirstLevel();
		f1.methodInFirstLevel(23);
	}
}
