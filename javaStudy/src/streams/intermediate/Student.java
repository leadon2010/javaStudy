package streams.intermediate;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		Student that = (Student) obj;
		return (this.name.equals(that.name) && this.score == that.score);
	}

	@Override
	public int compareTo(Student o) {
		return this.score - o.score;
	}

	@Override
	public String toString() {
		String str = String.format("%s %s", name, score);
		return str;
	}

}
