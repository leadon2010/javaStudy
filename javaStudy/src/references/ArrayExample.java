package references;

public class ArrayExample {
	public static void main(String[] args) {
		char[] chars = new char[10];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = '\u0001';
//			System.out.println(chars[i]);
		}
		System.out.println('\u0000');
		System.out.println("end");
	}
}
