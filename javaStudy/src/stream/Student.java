package stream;

public class Student {
	String name;
	int score;

	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	String getName() {
		return this.name;
	}

	int getScore() {
		return this.score;
	}
}
