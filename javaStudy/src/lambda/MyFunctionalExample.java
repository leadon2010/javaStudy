package lambda;

@FunctionalInterface
interface MyFunctionalInterface {
	public void run();
}

class UsingLocal {
	void method(int arg) {
		int localVar = 40;
//		arg = 30;
//		localVar = 30;
		MyFunctionalInterface fi = () -> {
			System.out.println("arg : " + arg);
			System.out.println("localVar : " + localVar);
		};
		fi.run();
	}
}

public class MyFunctionalExample {

	public static void main(String[] args) {
		UsingLocal ul = new UsingLocal();
		ul.method(30);

	} // end of main
}
