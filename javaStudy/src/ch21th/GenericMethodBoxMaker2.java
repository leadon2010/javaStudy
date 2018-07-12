package ch21th;

class Unboxer {
	public static <T> T openBox(BoxF<T> box) {
		return box.get();
	}
}

class GenericMethodBoxMaker2 {
	public static void main(String[] args) {
		BoxF<String> box = new BoxF<>();
		box.set("My Generic Method");

		String str = Unboxer.<String>openBox(box);
		System.out.println(str);
	}
}