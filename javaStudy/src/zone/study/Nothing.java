package zone.study;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

public class Nothing {
	public static void main(String[] args) {
		Box<Integer> box1 = new Box<>();
		box1.set(24);
		Box<Integer> box2 = new Box<>();
		box2.set(37);
		System.out.println(box1.get() + " & " + box2.get());
		swapBox(box1, box2);
		System.out.println(box1.get() + " & " + box2.get());

		Box<String> box3 = new Box<>();
		box3.set("a");
		Box<String> box4 = new Box<>();
		box4.set("b");
		System.out.println(box3.get() + " & " + box4.get());
		swapBox(box3, box4);
		System.out.println(box3.get() + " & " + box4.get());
	}

	public static <T> void swapBox(Box<T> b1, Box<T> b2) {
		T t = b1.get();
		b1.set(b2.get());
		b2.set(t);
	}

	public static <T> boolean compBox(Box<? extends T> box, T con) {
		T bc = box.get();
//		box.set(con);
		return bc.equals(con);
	}

	public static void addBox(Box<Integer> b1, Box<Integer> b2, Box<Integer> b3) {
		b3.set(b1.get() + b2.get());
	}
}
