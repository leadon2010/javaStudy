package api;

import java.util.Arrays;

class Car {
	String model;
	Car(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + "]";
	}
}

public class Member implements Cloneable {
	String id;
	String name;
	String password;
	int age;
	int[] scores;
	Car car;
	
	public Member(String id, String name, String password, int age) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
	}
	public Member(String id, String name, String password, int age, int[] scores, Car car) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Member mem = (Member) super.clone();
		mem.scores = Arrays.copyOf(this.scores, this.scores.length);
		mem.car = new Car(this.car.model);
		return mem;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", password=" + password + ", age=" + age + ", scores="
				+ Arrays.toString(scores) + ", car=" + car + "]";
	}
}
