package ch22;

class Box<T> {
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}
}

class Toy {

	@Override
	public String toString() {
		// return super.toString();
		return "I am a Toy";
	}

}

class Robot extends Toy {

	@Override
	public String toString() {
		// return super.toString();
		return "I am a Robot";
	}

}

class BoxHandler {
	public static void outBox(Box<? extends Toy> box) {
		Toy t = box.get();
		System.out.println(t);
		// box.set(new Toy());
	}

	public static void inBox(Box<? super Toy> box, Toy n) {
		box.set(n);
		Toy t = (Toy) box.get();
	}
}

public class BoundedWildcardUsage {
	public static void main(String[] args) {
		Box<Toy> box = new Box<>();
		BoxHandler.inBox(box, new Toy());
		BoxHandler.outBox(box);

		Toy t = new Robot();
		System.out.println(t.toString());
	}
}
