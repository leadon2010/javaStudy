package ch21th;

class Box21<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

}

public class Ex21 {
	public static void main(String[] args) {
		Box21<Integer> box1 = new Box21<>();
		box1.set(99);
		Box21<Integer> box2 = new Box21<>();
		box2.set(55);
		swapBox(box1, box2);
		swapBox(box1, box2);
		// System.out.println(box1.get() + " & " + box2.get());
	}

	public static <T extends Number> void swapBox(Box21<T> s, Box21<T> t) {
		Box21<T> temp = new Box21<>();
		temp.set(s.get());
		s.set(t.get());
		t.set(temp.get());
		System.out.println(s.get() + " & " + t.get());
	}
}
