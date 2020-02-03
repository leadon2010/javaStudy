package thisisjava.nestedClass.nested;

class Person {
	void wake() {
		System.out.println("7시에 일어납니다.");
	}
}

public class AnonymousClass {
	Person field = new Person() {
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}
	};

	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}

			@Override
			void wake() {
				System.out.println("7시반에 일어납니다.");
				walk();
			}
		};
		localVar.wake();
	}

	void method2(Person person) {
		person.wake();
	}

}
