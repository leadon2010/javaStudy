package basic;

public class CourseExample {
	public static void main(String[] args) {
		Course<Student> course = new Course<>("English", 10);
		course.add(new Student("Hong", 15, 88));
		course.add(new Student("Park", 20, 90));

		showCourse(course);
	}

	public static void showCourse(Course<?> course) {
		System.out.println("과정명: " + course.courseName);
		int sum = 0, studentCnt = 0;
		course.showMembers();

		Student[] students = course.getStudents();
		for (Student s : students) {
			if (s != null) {
				sum += s.score;
				studentCnt++;
			}
		}
		double avg = (double) sum / studentCnt;
		System.out.println("평균: " + avg);

	}
}
