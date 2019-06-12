package generic;

public class GenericBox {
	public static void main(String[] args) {

		Box<String> strBox = new Box<String>();
		strBox.set("hello");
		String str = strBox.get();
		System.out.println(str);

		Box<Integer> intBox = new Box<Integer>();
		intBox.set(10);
		int value = intBox.get();
		System.out.println(value);

	}
}
