package generic;

public class BoxingMethodExample {
	public static void main(String[] args) {
		Box<Integer> box1 = Util.boxing(new Integer(100));
		Integer intValue = box1.get();
		System.out.println(intValue.intValue());

		Box<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
