package thisisjava.generic.before;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();

		Apple apple = new Apple();
		box.set(apple);

		Orange notOrange = (Orange) box.get();

		Orange orange = new Orange();
		box.set(orange);

		Apple notApple = (Apple) box.get();

	}
}
