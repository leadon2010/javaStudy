package ch99;

import java.util.HashSet;

class Car {
	String color;
	String model;

	public Car(String c, String m) {
		color = c;
		model = m;
	}

	@Override
	public boolean equals(Object obj) {
		String m = ((Car) obj).model;
		String c = ((Car) obj).color;

		if (m.equals(model) && c.equals(color))
			return true;
		else
			return false;
	}

	@Override
	public int hashCode() {
		return (model.hashCode() + color.hashCode()) / 2;
	}

}

public class StrTest {
	public static void main(String[] args) {

		HashSet<Car> set = new HashSet<>();
		set.add(new Car("RED", "1980"));
		set.add(new Car("RED", "1980"));
		set.add(new Car("RED", "1980"));

		System.out.println(set.size());

	}
}
