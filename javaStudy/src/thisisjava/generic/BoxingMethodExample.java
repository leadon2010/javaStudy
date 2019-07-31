package thisisjava.generic;

public class BoxingMethodExample {
	public static void main(String[] args) {

		Box<Integer> box = Util.boxing(10);
		Integer intValue = box.get();
		System.out.println(intValue);

		Box<String> strBox = Util.boxing("hello");
		String strValue = strBox.get();
		System.out.println(strValue);

	}
}
