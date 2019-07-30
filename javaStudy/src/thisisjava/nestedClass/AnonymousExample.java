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

class Person {
	void wake() {
		System.out.println("wake up at 7.");
	}
}

class Anonymous {
	// 필드의 초기값
	Person field = new Person() {
		void work() {
			System.out.println("go to work.");
		}

		@Override
		void wake() {
			System.out.println("wake up at 6.");
			work();
		}
	};

	void method1() {
		// 로컬 변수의 초기값
		Person localVar = new Person() {
			void walk() {
				System.out.println("go to walk.");
			}

			@Override
			void wake() {
				System.out.println("wake up at 7.");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}
}

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anonymous = new Anonymous();
		anonymous.field.wake();

		anonymous.method1();

		anonymous.method2(new Person() {
			void study() {
				System.out.println("go to study.");
			}
			@Override
			void wake() {
				System.out.println("wake up at 8.");
				study();
			}
		});

	}
}
