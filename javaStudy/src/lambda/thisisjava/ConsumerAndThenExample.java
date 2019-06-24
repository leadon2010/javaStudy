package lambda.thisisjava;

import java.util.function.Consumer;

class Member {
	private String name;
	private String id;
	private Address address;

	public Member(String name, String id, Address address) {
		super();
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

}

class Address {
	private String country;
	private String city;

	public Address(String country, String city) {
		super();
		this.country = country;
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public String getCity() {
		return city;
	}

}

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (m) -> {
			System.out.println("consumerA: " + m.getName());
		};

		Consumer<Member> consumerB = (m) -> {
			System.out.println("consumerB: " + m.getId());
		};

		Consumer<Member> consumerAB = consumerA.andThen(consumerB);
		consumerAB.accept(new Member("hong", "h", null));
	}
}
