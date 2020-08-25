package lambda.predicate;

public class Student {
	private String name;
	private String gender;
	private int score;

	public Student(String name, String gender, int score) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public int getScore() {
		return score;
	}
}