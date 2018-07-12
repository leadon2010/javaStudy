package ch21th;

class BoxF<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class BoxFactory {
	public static <T> BoxF<T> makeBox(T o) {
		BoxF<T> box = new BoxF<T>();
		box.set(o);
		return box;
	}
}

class GenericMethodBoxMaker {
	public static void main(String[] args) {
		BoxF<String> sBox = BoxFactory.makeBox("Sweet");
		System.out.println(sBox.get());

		BoxF<Double> dBox = BoxFactory.makeBox(7.59);
		System.out.println(dBox.get());
	}
}