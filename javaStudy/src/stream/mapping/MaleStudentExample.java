package stream.mapping;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList(new Student("Hong", 10, Student.Sex.MALE),
				new Student("Hwang", 9, Student.Sex.FEMALE), new Student("Park", 8, Student.Sex.MALE),
				new Student("Choi", 7, Student.Sex.FEMALE));

		MaleStudent maleStudent = list.stream()//
				.filter(s -> s.getSex() == Student.Sex.MALE)//
				.collect(() -> new MaleStudent(), (ms, s) -> ms.accumulate(s), (ms1, ms2) -> ms1.combine(ms2));

		maleStudent.getList().stream().forEach(s -> System.out.println(s.getName()));
	}
}
