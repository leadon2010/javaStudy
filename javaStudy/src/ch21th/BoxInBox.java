package ch21th;

class BoxInBox {
	public static void main(String[] args) {
		Box_G<String> sBox = new Box_G<>();
		sBox.set("I am so happy.");

		Box_G<Box_G<String>> wBox = new Box_G<>();
		wBox.set(sBox);

		Box_G<Box_G<Box_G<String>>> zBox = new Box_G<>();
		zBox.set(wBox);

		System.out.println(zBox.get().get().get());
	}
}
