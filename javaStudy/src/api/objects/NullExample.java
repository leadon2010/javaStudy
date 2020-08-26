package api.objects;

import java.util.Objects;
import java.util.function.*;

public class NullExample {
	public static void main(String[] args) {
		String str1 = "Hong";
		String str2 = null;

		System.out.println(Objects.isNull(str2));
		System.out.println(Objects.nonNull(str2));

		System.out.println(Objects.requireNonNull(str1));

		try {
			System.out.println(Objects.requireNonNull(str2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(Objects.requireNonNull(str2, "Null 입니다"));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			System.out.println(Objects.requireNonNull(str2, new Supplier<String>() {
				@Override
				public String get() {
					return "이 부분은 null이 맞습니다";
				}
			}));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
