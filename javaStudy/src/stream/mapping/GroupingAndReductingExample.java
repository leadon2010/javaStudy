package stream.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAndReductingExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 10, Student.Sex.MALE),
				new Student("Hwang", 9, Student.Sex.FEMALE), new Student("Choi", 8, Student.Sex.MALE),
				new Student("Park", 7, Student.Sex.FEMALE));

		Map<Student.Sex, Double> mapBySex = list.stream()
				.collect(Collectors.groupingBy((s) -> s.getSex(), Collectors.averagingDouble(s -> s.getScore())));
		System.out.println("남학생 평균: " + mapBySex.get(Student.Sex.MALE));
		System.out.println("여학생 평균: " + mapBySex.get(Student.Sex.FEMALE));

		Map<Student.Sex, String> mapByName = list.stream().collect(
				Collectors.groupingBy(Student::getSex, Collectors.mapping(Student::getName, Collectors.joining(" "))));
		System.out.println("남학생이름: " + mapByName.get(Student.Sex.MALE));
		System.out.println("여학생이름: " + mapByName.get(Student.Sex.FEMALE));
	}
}
