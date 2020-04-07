package stream.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class GroupingByExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 10, Student.Sex.MALE, Student.City.Seoul) //
				, new Student("Hwang", 9, Student.Sex.FEMALE, Student.City.Pusan)//
				, new Student("Choi", 8, Student.Sex.MALE, Student.City.Pusan)//
				, new Student("Park", 7, Student.Sex.FEMALE, Student.City.Seoul)//
		);

		Map<Student.Sex, List<Student>> mapBySex = list.stream().collect(Collectors.groupingBy((s) -> s.getSex()));

		System.out.println("[남학생]");
		mapBySex.get(Student.Sex.MALE).stream().forEach(s -> System.out.println(s.getName()));

		System.out.println("[여학생]");
		mapBySex.get(Student.Sex.FEMALE).stream().forEach(s -> System.out.println(s.getName()));

		System.out.println();

		Collector<Student, ?, Map<Student.City, List<String>>> collector3 = Collectors.groupingBy((s) -> s.getCity(),
				Collectors.mapping((s) -> s.getName(), Collectors.toList()));
		Map<Student.City, List<String>> mapByCity = list.stream().collect(collector3);

		System.out.println("[서울]");
		mapByCity.get(Student.City.Seoul).stream().forEach(s -> System.out.println(s.toString()));

		System.out.println("[부산]");
		mapByCity.get(Student.City.Pusan).stream().forEach(s -> System.out.println(s.toString()));

	}
}
