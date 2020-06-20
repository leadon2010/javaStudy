package streams.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<Student> totalist = Arrays.asList(new Student("Hong1", 23, Student.Sex.MALE),
				new Student("Hong2", 23, Student.Sex.FEMALE), new Student("Hong3", 23, Student.Sex.MALE),
				new Student("Hong4", 23, Student.Sex.FEMALE));

		List<Student> maleList = totalist.stream().filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());

		maleList.stream().forEach(s -> System.out.println(s.getName()));
		System.out.println("============================================================");

		Supplier<Set<Student>> supplier = new Supplier<Set<Student>>() {
			@Override
			public Set<Student> get() {
				return new HashSet<>();
			}
		};

		Set<Student> femaleList = totalist.stream().filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(new Supplier<Set<Student>>() {
					@Override
					public Set<Student> get() {
						return new HashSet<Student>();
					}
				}));
		femaleList.stream().forEach(s -> System.out.println(s.getName()));
	}
}
