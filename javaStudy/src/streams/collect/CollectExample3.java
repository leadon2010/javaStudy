package streams.collect;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import streams.collect.Student.City;
import streams.collect.Student.Sex;

public class CollectExample3 {
	public static void main(String[] args) {

		List<Student> totalist = Arrays.asList(//
				new Student("Hong1", 23, Student.Sex.MALE, Student.City.Seoul), //
				new Student("Hong2", 23, Student.Sex.FEMALE, Student.City.Pusan), //
				new Student("Hong3", 23, Student.Sex.MALE, Student.City.Seoul), //
				new Student("Hong4", 23, Student.Sex.FEMALE, Student.City.Pusan)//
		);

		// 1. Map<T, Set<T>>
		System.out.println("---------Set<Student>------------");
		Collector<Student, ?, Map<Sex, Set<Student>>> collectors = //
				Collectors.groupingBy(new Function<Student, Student.Sex>() {
					@Override
					public Sex apply(Student t) {
						return t.getSex();
					}
				}, Collectors.toCollection(new Supplier<Set<Student>>() {
					@Override
					public Set<Student> get() {
						return new HashSet<>();
					}
				}));
		Map<Student.Sex, Set<Student>> toSet = totalist.stream().collect(collectors);
		for (Map.Entry<Student.Sex, Set<Student>> ent : toSet.entrySet()) {
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}

		// 2. Map<T, List<T>>
		System.out.println("-------------List<Student>---------------");
		Map<Student.Sex, List<Student>> mapBySex = totalist.stream()
				.collect(Collectors.groupingBy(new Function<Student, Student.Sex>() {
					@Override
					public Sex apply(Student t) {
						return t.getSex();
					}
				}));
		for (Map.Entry<Student.Sex, List<Student>> ent : mapBySex.entrySet()) {
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}

		System.out.print("[남학생]: ");
		mapBySex.get(Student.Sex.MALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();
		System.out.print("[여학생]: ");
		mapBySex.get(Student.Sex.FEMALE).stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();

		// 2-1. Student city
		Map<Student.City, List<Student>> mapByCity = totalist.stream()
				.collect(Collectors.groupingBy(Student::getCity, Collectors.toList()));

		System.out.print("[서울]: ");
		mapByCity.get(Student.City.Seoul).stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();
		System.out.print("[부산]: ");
		mapByCity.get(Student.City.Pusan).stream().forEach(s -> System.out.print(s.getName() + " "));
		System.out.println();

		// 3.
		System.out.println("----------last----------");
		Function<Student, Student.City> classfier = new Function<Student, Student.City>() {
			@Override
			public City apply(Student t) {
				return t.getCity();
			}
		};
		Function<Student, String> mapper = new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		};
		Collector<String, ?, List<String>> collector = Collectors.toList();
		Collector<Student, ?, Map<Student.City, List<String>>> mainCol = Collectors.groupingBy(classfier,
				Collectors.mapping(mapper, collector));

		for (Map.Entry<Student.City, List<String>> ent : totalist.stream().collect(mainCol).entrySet()) {
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}
	}
}
