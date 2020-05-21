package lambda;

import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SupplierExample {
	public static void main(String[] args) {

		Supplier<String> supplier = () -> {
			String field = "Nice";
			return field + ", World";
		};
		System.out.println(supplier.get());

		BooleanSupplier boolSup = () -> {
			class Member {
				String name;

				Member(String name) {
					this.name = name;
				}

				String get() {
					return name;
				}
			}

			Member m1 = new Member("Hong");
			Member m2 = new Member("Hwang");

			return m1.get().equals(m2.get());
		};
		System.out.println(boolSup.getAsBoolean());

		IntSupplier intSupplier = () -> (int) (Math.random() * 6) + 1;

		System.out.println(intSupplier.getAsInt());

	}
}
