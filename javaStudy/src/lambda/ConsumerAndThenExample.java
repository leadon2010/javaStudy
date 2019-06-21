package lambda;

import java.util.function.Consumer;

class Address {
	private String country;
	private String city;

	public Address(String country, String city) {
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}
}// end of Address

class Member {
	private String name;
	private String id;
	private Address address;

	public Member(String name, String id, Address address) {
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public Address getAddress() {
		return address;
	}

}// end of Member

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA : " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB : " + m.getId());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("홍길동", "hong", null));

	}// end of main

}// end of ConsumerAndThenExample
