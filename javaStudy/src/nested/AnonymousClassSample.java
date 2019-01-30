package nested;

public class AnonymousClassSample {
	public static void main(String[] args) {

		System.out.println("start of program.");
		AnonymousClass anony = new AnonymousClass();

		anony.field.wake();
		anony.method1();
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			};

			@Override
			void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		System.out.println("end of program.");
	}
}
