package thisisjava.nestedClass;

interface RemoteControl {
	void turnOn();

	void turnOff();
}

class TV implements RemoteControl {
	@Override
	public void turnOn() {
		System.out.println("turn on");
	}

	@Override
	public void turnOff() {
		System.out.println("turn off");
	}
}

class AA {
	RemoteControl remotecontrol = new TV();

	void method1() {
		RemoteControl localVar = new TV();
	}
}

class BB {
	RemoteControl rc = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("Anonymous turn on");
		}

		@Override
		public void turnOff() {
			System.out.println("Anonymous turn off");
		}

	};

	void method2(RemoteControl rc) {
		System.out.println("method2");
	}

	void method3() {
		method2(new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Anonymous argument turn on");
			}

			@Override
			public void turnOff() {
				System.out.println("Anonymous argument turn off");
			}

		});
	}
}

//////////////////////////////////////////////////

class AnonymousInterface {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("turn on TV");
		}

		@Override
		public void turnOff() {
			System.out.println("turn off TV");
		}
	};

	void method1() {
		RemoteControl localVar = new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turn on Audio");
			}

			@Override
			public void turnOff() {
				System.out.println("turn off Audio");
			}
		};
		localVar.turnOn();
		localVar.turnOff();
	}

	void method2(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}

public class AnonymousInterfaceExample {
	public static void main(String[] args) {
		AnonymousInterface anony = new AnonymousInterface();
		anony.field.turnOn();
		anony.field.turnOn();

		anony.method1();

		anony.method2(new RemoteControl() {
			@Override
			public void turnOn() {
				System.out.println("turn on SmartTV");
			}

			@Override
			public void turnOff() {
				System.out.println("turn off SmartTV");
			}
		});
	}
}
