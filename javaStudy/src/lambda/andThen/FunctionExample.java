package lambda.andThen;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<Member, Address> func1 = (m) -> {
			return m.getAddress();
		};
		Function<Address, String> func2 = (a) -> {
			return a.getCity();
		};

		Function<Member, String> func3 = func1.andThen((a) -> a.getCountry());
		String city = func3.apply(new Member("Hong", "hong", new Address("Korea", "Seoul")));
		System.out.println(city);

		func3 = func2.compose(func1);
		city = func3.apply(new Member("Park", "park", new Address("Korea", "Incheon")));
		System.out.println(city);
	}
}
