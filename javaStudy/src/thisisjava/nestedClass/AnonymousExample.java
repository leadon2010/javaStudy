package thisisjava.nestedClass;

class A {
	Parent parent = new Child();

	void method() {
		Parent localParent = new Child();
		System.out.println(localParent);
	}
}

class B {
	Parent parent = new Parent() {
		int childField;

		void childMethod() {
			System.out.println("child method");
		}

		@Override
		void parentMethod() {
			super.parentMethod();
		}

	};
	
	void method() {
		Parent localParent = new Parent() {
			
		};
	}
}

public class AnonymousExample {

}
