package thisisjava.nestedClass;

public class OuterExample {
	public static void main(String[] args) {
		// Outer클래스의 메소드 호출
		Outer outer = new Outer();
		outer.method();

		// Outer 클래스의 B 클래스의 생성자 호출시
		Outer.B b = outer.new B();
		b.fieldB = 1;
		b.methodB();

		// 정적 클래스 C 의 인스턴스 생성
		Outer.C c = new Outer.C();
		c.fieldC = 3;
		c.methodC();

		// 정적클래스의 정적 필드 생성시
		Outer.C.fieldCC = 4;
		Outer.C.methodCC();

		// 중첩 인터페이스의 구현
		Outer.D d = new Outer.D() {

			@Override
			public void methodD() {
				System.out.println(Outer.D.fieldD + " methodD call");
			}

		};
		d.methodD();
	}
}
