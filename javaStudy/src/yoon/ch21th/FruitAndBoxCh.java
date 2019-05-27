package yoon.ch21th;

class Apple1 {
	public String toString() {
		return "I am an apple";
	}
}

class Orange1 {
	public String toString() {
		return "I am an orange";
	}
}

class AppleBox1 {
	private Apple ap;

	public void set(Apple a) {
		ap = a;
	}

	public Apple get() {
		return ap;
	}
}

class OrangeBox1 {
	private Orange or;

	public void set(Orange o) {
		or = o;
	}

	public Orange get() {
		return or;
	}
}

class Box1 {
	private Object ob;

	public void set(Object o) {
		ob = o;
	}

	public Object get() {
		return ob;
	}
}

public class FruitAndBoxCh {
	public static void main(String[] args) {
		Box apBox = new Box();
		Box orBox = new Box();

		// apBox.set(new Apple());
		// orBox.set(new Orange());
		apBox.set("Apple");
		orBox.set("Orange");

		// Apple apl = (Apple) apBox.get();
		// Orange orn = (Orange) orBox.get();
		System.out.println(apBox.get());
		System.out.println(orBox.get());

		System.out.println("===================================");
		AppleBox aBox = new AppleBox();
		OrangeBox oBox = new OrangeBox();

		aBox.set(new Apple());
		oBox.set(new Orange());

		Apple ap = aBox.get();
		Orange og = oBox.get();

		System.out.println(ap);
		System.out.println(og);
		System.out.println("===================================");
	}
}
