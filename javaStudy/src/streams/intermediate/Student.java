package streams.intermediate;

public class Student implements Comparable<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	@Override
	public int hashCode() {
		return this.name.hashCode() + this.score;
	}

	@Override
	public boolean equals(Object obj) {
		boolean val = false;
		Student std = (Student) obj;
		if (this.name.compareTo(std.name) == 0)
			val = true;
		else
			val = false;
		return val;
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
