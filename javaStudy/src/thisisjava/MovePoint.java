package thisisjava;

class Students {
	String name;
	int kor;
	int eng;
	int mat;

	public Students(String name, int kor, int eng, int mat) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	int totalScore() {
		return kor + eng + mat;
	}

}

class Lesson {
	String major;
	Students[] studentAry;

	public Lesson(String major, Students[] studentAry) {
		super();
		this.major = major;
		this.studentAry = studentAry;
	}

	double avgKor() {
		double sum = 0;
		int member = 0;
		for (int i = 0; i < studentAry.length; i++) {
			if (studentAry[i] != null) {
				sum += studentAry[i].kor;
				member++;
			}
		}
		return sum / member;
	}

	void sortScore() {
		for (int i = 0; i < studentAry.length; i++) {

		}
	}

}

public class MovePoint {
	public static void main(String[] args) {
		Students[] javaStudents = new Students[10];
		Students[] dbStudents = new Students[10];
		Students[] finStudents = new Students[10];

		javaStudents[0] = new Students("name11", 50, 60, 70);
		javaStudents[1] = new Students("name12", 70, 60, 70);
		javaStudents[2] = new Students("name13", 80, 60, 70);
		dbStudents[0] = new Students("name21", 55, 66, 77);
		finStudents[0] = new Students("name31", 66, 55, 44);

		Lesson javaLesson = new Lesson("java", javaStudents);
		Lesson dbLesson = new Lesson("db", dbStudents);
		Lesson finLesson = new Lesson("fin", finStudents);

		System.out.println(javaLesson.avgKor());
	}
}
