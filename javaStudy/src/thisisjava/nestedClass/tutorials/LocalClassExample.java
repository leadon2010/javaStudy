package thisisjava.nestedClass.tutorials;

public class LocalClassExample {

	// 1.
	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(String phoneNumber1, String phoneNumber2) {
		final int numberLength = 10;

		class PhoneNumber {
			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				String currentNumber = phoneNumber.replaceAll(regularExpression, "");
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());

		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());
	};

	// 2.
	public interface HelloThere {
		void greet();
	}

	public static void greetInEnglish(String name) {
		class EnglishHelloThere implements HelloThere {
			String name;

			EnglishHelloThere(String name) {
				this.name = name;
			}

			@Override
			public void greet() {
				System.out.println("Hello " + this.name);
			}
		}
		HelloThere myGreeting = new EnglishHelloThere(name);
		myGreeting.greet();
	}

	public static void main(String[] args) {
		validatePhoneNumber("123-456-7890", "456-7890");
		System.out.println();
		greetInEnglish("John");
	}
}
