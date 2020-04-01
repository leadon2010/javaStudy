package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class HighStudent {
	private String name;
	private String sex;
	private int score;

	public HighStudent(String name, String sex, int score) {
		super();
		this.name = name;
		this.sex = sex;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}

public class PredicatorExample {
	private static List<HighStudent> list = Arrays.asList(new HighStudent("홍길동", "남자", 90),
			new HighStudent("김순희", "여자", 90), new HighStudent("박길동", "남자", 85), new HighStudent("박순희", "여자", 92));

	public static double avg(Predicate<HighStudent> predicate) {
		int cnt = 0, sum = 0;
		for (HighStudent student : list) {
			if (predicate.test(student)) {
				cnt++;
				sum += student.getScore();
			}
		}
		return (double) sum / cnt;
	}

	public static void main(String[] args) {
		double femaleAvg = avg((t) -> {
			return t.getSex().equals("여자");
		});
		System.out.println("여자 평균 점수: " + femaleAvg);

		double maleAvg = avg(t -> t.getSex().equals("남자"));
		System.out.println("남자 평균 점수: " + maleAvg);

	}
}
