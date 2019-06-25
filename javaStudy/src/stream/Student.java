package stream;

import java.util.Comparator;

public class Student implements Comparable<Student> , Comparator<Student> {
	private String name;
	private int score;

	public Student(String name, int score) {
		super();
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
	public int compareTo(Student o) {
		return Integer.compare(score, o.score);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.score, o2.score);
	}

}
