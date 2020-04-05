package lambda;

import java.util.function.Consumer;

class Address {
	String country;
	String city;

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

class Member {
	String name;
	String id;
	Address address;

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

class ConsumerA<T> implements Consumer<T> {
	@Override
	public void accept(T t) {
		Member m = (Member) t;
		System.out.println(m.getName());
	}
}

class ConsumerB<T> implements Consumer<T> {
	@Override
	public void accept(T t) {
		Member m = (Member) t;
		System.out.println(m.getId());
	}
}

class ConsumerC<T> implements Consumer<T> {
	Member member = new Member("Hong", "user1", null);
	ConsumerA<Member> ca = new ConsumerA<>();
	ConsumerB<Member> cb = new ConsumerB<>();

	@Override
	public void accept(T t) {
		Member m = (Member) t;
		ca.accept(m);
		cb.accept(m);
	}
}

public class ConsumerAndThenExample {
	public static void main(String[] args) {
		Consumer<Member> consumerA = (t) -> {
			System.out.println("consumerA: " + t.getName());
		};
		Consumer<Member> consumerB = (t) -> {
			System.out.println("consumerB: " + t.getId());
		};
		Consumer<Member> consumerC = consumerA.andThen(consumerB);

		consumerC.accept(new Member("Hong", "user1", null));

//		Member member = new Member("Hong", "user1", null);
//		Consumer<Member> ca = new ConsumerA<>();
//		ca.accept(member);
//
//		Consumer<Member> cb = new ConsumerB<>();
//		cb.accept(member);
//
//		Consumer<Member> cc = new ConsumerC<>();
//		cc.accept(member);
	}
}
