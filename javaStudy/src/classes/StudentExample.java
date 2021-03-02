package classes;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = newStudent("Hong", 69, 70);

	}

	public static Student newStudent(String name, int eng, int math) {
		Student std = new Student();
		std.setName(name);
		std.setEng(eng);
		std.setMath(math);

		return std;
	}
}
