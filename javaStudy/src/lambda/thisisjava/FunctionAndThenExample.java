package lambda.thisisjava;

import java.util.function.Function;

public class FunctionAndThenExample {
	public static void main(String[] args) {
		Function<Member, Address> functionA;
		Function<Address, String> functionB;
		Function<Member, String> functionAB;
		String city;

		functionA = (m) -> m.getAddress();
		functionB = (a) -> a.getCity();

		functionAB = functionA.andThen(functionB);
		city = functionAB.apply(new Member("hongkildong", "hong", new Address("Korea", "Seoul")));
		System.out.println(city);

		functionAB = functionB.compose(functionA);
		city = functionAB.apply(new Member("hongkildong", "hong", new Address("Korea", "Daejun")));
		System.out.println(city);
	}
}
