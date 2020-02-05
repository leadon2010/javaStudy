package thisisjava.generic;

public class BoxExample {
	public static void main(String[] args) {
		Box<Apple> boxForApple = new Box<>();
		Apple apple = new Apple();
		boxForApple.set(apple);

//		 Orange o1 = boxForApple.get(); 강력한 타입 체크.

		Box<Orange> boxForOrange = new Box<>();
		Orange orange = new Orange();
		boxForOrange.set(orange);

		Orange o = boxForOrange.get();
	}
}
