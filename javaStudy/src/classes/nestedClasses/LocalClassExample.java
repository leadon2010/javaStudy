package classes.nestedClasses;

public class LocalClassExample {
	static String regularExp = "[^0-9]";

	public static void validatePhoneNumber(String phone1, String phone2) {
		final int numberLength = 10;

		class PhoneNumber {
			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				String currentNumber = phoneNumber.replaceAll(regularExp, "");
				if (currentNumber.length() == numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}
		} // end of PhoneNumber

		PhoneNumber number1 = new PhoneNumber(phone1);
		PhoneNumber number2 = new PhoneNumber(phone2);

		if (number1.getNumber() == null)
			System.out.println("First is invalid number");
		else
			System.out.println("First number is " + number1.getNumber());

		if (number2.getNumber() == null)
			System.out.println("Second is invalid number");
		else
			System.out.println("Second number is " + number2.getNumber());
	}

	public static void main(String[] args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}
