package stream;

import java.util.Arrays;
import java.util.List;

class Member {
	public static int MALE = 0;
	public static int FEMALE = 1;

	private String name;
	private int sex;
	private int age;

	public Member(String name, int sex, int age) {
		super();
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getSex() {
		return sex;
	}

	public int getAge() {
		return age;
	}

}

public class StreamPipelinesExample {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("hong", Member.MALE, 30), new Member("Kim", Member.FEMALE, 20),
				new Member("shin", Member.MALE, 45), new Member("park", Member.FEMALE, 27));

		double ageAvg = list.stream().filter(m -> m.getSex() == Member.MALE).mapToInt(Member::getAge).average()
				.getAsDouble();
		System.out.println("Male Avg age: " + ageAvg);
	}
}
