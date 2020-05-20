package generic;

public class BoxingExample {
	public static void main(String[] args) {
		Box<Integer> box = Utils.boxing(null);
		int r = box.get();
		
		Box<Apple> appleBox = Utils.boxing(new Apple(1000));
		Apple apple = appleBox.get();
		
		Box<Orange> orangeBox = Utils.boxing(new Orange(2000));
		Orange orange = orangeBox.get();
	}
}
