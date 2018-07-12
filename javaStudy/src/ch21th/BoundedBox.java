package ch21th;

class Box_T<T extends Number> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

	//Number 클래스를 상속하는 클래스만 올 수 있다. 상속을 하지 않으면 에러발생.
	public int toIntValue() {
		return ob.intValue();
	}
}

class BoundedBox {
	public static void main(String[] args) {
		Box_T<Integer> iBox = new Box_T<>();
		iBox.set(24);

		Box_T<Double> dBox = new Box_T<>();
		dBox.set(5.97);

		// Box_T<String> sBox = new Box_T<>(); Number 상속하는 클래스만 올 수 있다...

		System.out.println(iBox.get());
		System.out.println(dBox.get());
	}
}