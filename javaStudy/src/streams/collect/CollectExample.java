package streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {

		List<Student> totalist = Arrays.asList(new Student("Hong1", 80, Student.Sex.MALE),
				new Student("Hong2", 56, Student.Sex.FEMALE), new Student("Hong3", 69, Student.Sex.MALE),
				new Student("Hong4", 89, Student.Sex.FEMALE));

		// toList, toSet 컬렉터.
		Collector<Student, ?, List<Student>> toList = Collectors.toList();
		Collector<Student, ?, Set<Student>> toSet = Collectors.toSet();

		// toList 컬렉터에 저장.
		List<Student> maleList = totalist.stream().filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(Collectors.toList());
		maleList.stream().forEach(s -> System.out.println(s.getName()));

		// toSet 컬렉터에 저장.
		Supplier<Set<Student>> supplier = new Supplier<Set<Student>>() {
			@Override
			public Set<Student> get() {
				return new HashSet<>();
			}
		};
		Set<Student> femaleList = totalist.stream().filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(supplier));
		femaleList.stream().forEach(s -> System.out.println(s.getName()));

		// Collector.of 인스턴스 생성하기.
		// Collector<Student, ?, List<Student>> 또는 Collector<Student, ?, Set<Student>> 저장하기.
		totalist.stream().collect(Collector.of(//
				new Supplier<List<Student>>() {
					@Override
					public List<Student> get() {
						return new ArrayList<Student>();
					}
				}, new BiConsumer<List<Student>, Student>() {
					@Override
					public void accept(List<Student> t, Student u) {
						t.add(u);
					}
				}, new BinaryOperator<List<Student>>() {
					@Override
					public List<Student> apply(List<Student> t, List<Student> u) {
						t.addAll(u);
						return t;
					}
				}, Characteristics.CONCURRENT));
	}
}
