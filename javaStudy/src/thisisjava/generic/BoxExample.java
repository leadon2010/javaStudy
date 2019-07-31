package thisisjava.generic;

class Box<T> {
	private T object;

	public void set(T object) {
		this.object = object;
	}

	public T get() {
		return this.object;
	}
}

class Apple {

}

class Orange {

}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();
		box.set("hello");
		String str = box.get();
		System.out.println(str);
	}
}
