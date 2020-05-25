package generic;

import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {
		Supplier<String> sup = () -> "Hello";
		System.out.println(sup.get());
	}
}

