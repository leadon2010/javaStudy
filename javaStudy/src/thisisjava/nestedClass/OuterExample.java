package thisisjava.nestedClass;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.B b = outer.new B();
		b.field1 = 1;
		b.method1();

		Outer.C.field3 = 3;
		Outer.C.method3();

		Outer.D d = new Outer.D() {

			@Override
			public void method4() {
				System.out.println(Outer.D.field4 + " method4 call");
			}

		};	
		d.method4();
	}
}
