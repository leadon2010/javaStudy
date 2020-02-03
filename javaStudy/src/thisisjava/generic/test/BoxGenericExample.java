package thisisjava.generic.test;

public class BoxGenericExample {
	public static void main(String[] args) {

		Box<String> strBox = new Box<String>();
		strBox.set("hello");
		String strValue = strBox.get();
		System.out.println(strValue);

		Box<Integer> intBox = new Box<Integer>();
		intBox.set(10);
		int intValue = intBox.get();
		System.out.println(intValue);

	}
}
