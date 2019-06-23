package yoon.ch21;

class Box2<T> {
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
		Box2<Apple> aBox = new Box2<Apple>();
		Box2<Orange> oBox = new Box2<Orange>();

		// 과일을 박스에 담은 것일까?
//		aBox.set("Apple");
//		oBox.set("Orange");

		// 박스에서 과일을 제대로 꺼낼 수 있을까?
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}
