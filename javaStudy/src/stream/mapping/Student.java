package stream.mapping;

public class Student implements Comparable<Student> {
	public enum Sex {
		MALE, FEMALE
	}

	public enum City {
		Seoul, Pusan
	}

	String name;
	int score;
	Sex sex;
	City city;

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}

	public Student(String name, int score, Sex sex) {
		super();
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public Student(String name, int score, Sex sex, City city) {
		super();
		this.name = name;
		this.score = score;
		this.sex = sex;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	public Sex getSex() {
		return sex;
	}

	public City getCity() {
		return city;
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}
}
