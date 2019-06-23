package yoon.ch21th;

class Box_G<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class FruitAndBoxFault_Generic {
	public static void main(String[] args) {
		Box_G<Apple> aBox = new Box_G<Apple>();
		Box_G<Orange> oBox = new Box_G<Orange>();

		// 과일을 박스에 담은 것일까?
//		aBox.set("Apple");
//		oBox.set("Orange");
		// aBox.set(new Apple());
		// oBox.set(new Orange());

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}