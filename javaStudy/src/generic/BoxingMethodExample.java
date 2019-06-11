package generic;

class Boxs<T> {
	private T t;

	public void set(T t) {
		this.t = t;
	}

	public T get() {
		return t;
	}
}

class Util {
	public static <T> Boxs<T> boxing(T t) {
		Boxs<T> box = new Boxs<T>();
		box.set(t);
		return box;
	}
}

public class BoxingMethodExample {
	public static void main(String[] args) {
		Boxs<Integer> box1 = Util.boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);

		Boxs<String> box2 = Util.boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}
}
