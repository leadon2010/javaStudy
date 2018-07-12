package ch21th;

class FruitAndBoxFault2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		// 과일을 박스에 담은 것일까?
		aBox.set("Apple");
		oBox.set("Orange");

		System.out.println(aBox.get());
		System.out.println(oBox.get());
	}
}