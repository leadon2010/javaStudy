package yoon.ch21th;

class BoxG<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class FruitAndBox2_Generic {
	public static void main(String[] args) {
		BoxG<Apple> aBox = new BoxG<Apple>();
		BoxG<Orange> oBox = new BoxG<Orange>();

		// 과일을 박스에 담는다.
		aBox.set(new Apple());
		oBox.set(new Orange());

		// 박스에서 과일을 꺼내는데 형 변환 하지 않는다.
		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
	}
}
