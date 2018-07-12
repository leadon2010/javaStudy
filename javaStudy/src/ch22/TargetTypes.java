package ch22;

class Box2<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class EmptyBoxFactory {
	public static <T> Box2<T> makeBox() {
		Box2<T> box = new Box2<T>();
		return box;
	}
}

class TargetTypes {
	public static void main(String[] args) {
		Box2<Integer> iBox = EmptyBoxFactory.<Integer>makeBox();
		iBox.set(25);
		System.out.println(iBox.get());
	}
}
