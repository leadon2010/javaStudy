package basic;

import java.util.Arrays;



public class Course<T extends Student> {
	String courseName;
	T[] students = null;
	double avg = 0;

	Course(String courseName, int capacity) {
		this.courseName = courseName;
		students = (T[]) new Student[capacity];
	}

	public String getCourseName() {
		return courseName;
	}

	public T[] getStudents() {
		return students;
	}

	public void add(T student) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = student;
				break;
			}
		}
	}

	public double getAvg() {
		int sum = 0, cnt = 0;
		double avg = 0;
		for (int i = 0; i < students.length; i++) {
			if (students[i] != null) {
				Student stud = (Student) students[i];
				sum += stud.score;
				cnt++;
			}
		}
		avg = (double) sum / cnt;
		return avg;
	}

	public void showMembers() {
		for (T t : students) {
			if (t != null)
				System.out.println(t.toString());
		}
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + ", students=" + Arrays.toString(students) + "]";
	}

}
