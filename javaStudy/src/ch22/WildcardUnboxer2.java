package ch22;

class Unboxer2 {
	public static <T> T openBox(Box<T> box) {
		return box.get();
	}

	public static void peekBox(Box<?> box) {
		System.out.println(box);
	}
}

class WildcardUnboxer2 {
	public static void main(String[] args) {
		Box<String> box = new Box<>();
		box.set("So Simple String");
		Unboxer2.peekBox(box);
	}
}