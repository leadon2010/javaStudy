package api.object;

class Car {
	String model;

	Car(String model) {
		this.model = model;
	}
}

public class Member implements Cloneable {
	public String name;
	public String id;
	public int age;
	public int[] scores;
	public Car car;

	public Member(String id) {
		super();
		this.id = id;
	}

	public Member(String name, int age, int[] scores, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member mem = (Member) obj;
			return this.id.equals(mem.id);
		} else
			return false;
	}

	public Member getMember() {
		Member mem = null;
		try {
			mem = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mem;
	}
}
