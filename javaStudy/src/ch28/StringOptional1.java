package ch28;

import java.util.Optional;

class StringOptional1 {
	public static void main(String[] args) {
		Optional<String> os1 = Optional.of(new String("Toy1"));
		Optional<String> os2 = Optional.ofNullable(new String("Toy2"));

		if (os1.isPresent())
			System.out.println(os1.get());

		os1.ifPresent(s -> System.out.println(s));
		os1.ifPresent(System.out::println);

		if (os2.isPresent())
			System.out.println(os2.get());
		System.out.println("=====end of program======");
	}
}
