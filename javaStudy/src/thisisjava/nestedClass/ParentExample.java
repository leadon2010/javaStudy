package thisisjava.nestedClass;

class Parent {
	int parentField;

	void parentMethod() {

	}
}

class Child extends Parent {
	int childField;

	void childMethod() {

	}

	@Override
	void parentMethod() {
		super.parentMethod();
	}

}

class Sample {
	Parent parent;

	void method1(Parent parent) {

	}

	void method2() {
		method1(new Parent() {
			int childField;

			void childMethod() {
				System.out.println("child method call");
			}

			@Override
			void parentMethod() {
				System.out.println("parent method call");
			}
		});
	}

}

public class ParentExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.parentField = 10;
		parent.parentMethod();
	}
}
