package thisisjava.generic.test;

public class ProductsExample {
	public static void main(String[] args) {
		Products<Tv, String, String> products = new Products<>();
		Tv tv = products.getKind();
		String model = products.getModel();
		String value = products.getValue();
		System.out.printf("%2s%2s%2s", tv, model, value);
	}
}
