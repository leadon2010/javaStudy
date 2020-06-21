package streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import streams.collect.Student.Sex;

public class CollectExample3 {
	public static void main(String[] args) {
		List<Student> totalist = Arrays.asList(new Student("Hong1", 23, Student.Sex.MALE, Student.City.Seoul),
				new Student("Hong2", 23, Student.Sex.FEMALE, Student.City.Pusan),
				new Student("Hong3", 23, Student.Sex.MALE, Student.City.Seoul),
				new Student("Hong4", 23, Student.Sex.FEMALE, Student.City.Pusan));

		// 1. Student.sex
		Map<Student.Sex, List<Student>> mapBySex = totalist.stream()
				.collect(Collectors.groupingBy(new Function<Student, Student.Sex>() {
					@Override
					public Sex apply(Student t) {
						return t.getSex();
					}
				}));
		System.out.print("남학생: ");
		mapBySex.get(Student.Sex.MALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();
		System.out.print("여학생: ");
		mapBySex.get(Student.Sex.FEMALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();

		// 2. Student city
		Map<Student.City, List<Student>> mapByCity = totalist.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.toList()));

		mapByCity.get(Student.City.Seoul).stream().forEach(s -> System.out.print(s.getName() + " "));
	}
}
