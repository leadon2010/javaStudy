package classes.nestedClasses;

public class HelloWorldAnonymousClass {
	interface HelloWorld {
		public void greet();

		public void greetSomeone(String someone);
	}

	public void sayHello() {
		class EnglishGreet implements HelloWorld {
			String name;

			@Override
			public void greet() {
				greetSomeone("World");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}

		}
		HelloWorld englishGreet = new EnglishGreet();

		HelloWorld spanishGreet = new HelloWorld() {
			String name = "mundo";

			@Override
			public void greet() {
				greetSomeone("mundo");
			}

			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola " + name);
			}

		};

		englishGreet.greet();
		spanishGreet.greet();

	} // end of sayHello();

	public static void main(String[] args) {
		HelloWorldAnonymousClass hello = new HelloWorldAnonymousClass();
		hello.sayHello();
	}
}
