package generic;

class Box<T> {
	private T object;

	public void set(T object) {
		this.object = object;
	}

	public T get() {
		return object;
	}
}

class Apple {
	int price;

	Apple(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple price : " + this.price;
	}
}

class Orange {
	int price;

	Orange(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Orange price : " + this.price;
	}
}

public class BoxExample {
	public static void main(String[] args) {
		Box<String> box = new Box<String>();

		box.set("Hong");
		String str = box.get();
		System.out.println(str);

		Box<Apple> appleBox = new Box<Apple>();
		appleBox.set(new Apple(1000));
		appleBox.set(new Apple(200));
		Apple apple = appleBox.get();
		System.out.println(apple.toString());

		Box<Orange> orangeBox = new Box<>();
		orangeBox.set(new Orange(2000));
		Orange orange = orangeBox.get();
		System.out.println(orange.toString());

	}
}
