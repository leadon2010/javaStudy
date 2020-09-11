package streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;
import java.util.stream.Collectors;

import streams.collect.Student.Sex;

public class CollectExample {
	public static void main(String[] args) {

		List<Student> totalist = Arrays.asList(//
				new Student("Hong1", 80, Student.Sex.MALE), //
				new Student("Hong2", 56, Student.Sex.FEMALE), //
				new Student("Hong3", 69, Student.Sex.MALE), //
				new Student("Hong4", 89, Student.Sex.FEMALE)//
		);

		// toList, toSet 컬렉터.
		Collector<Student, ?, List<Student>> toList = Collectors.toList();
		Collectors.toCollection(new Supplier<List<Student>>() {
			@Override
			public List<Student> get() {
				return new ArrayList<Student>();
			}

		});
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
		// Collector<Student, ?, List<Student>> 또는 Collector<Student, ?, Set<Student>>
		// 저장하기.
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

		// toMap
		Map<String, Integer> toMap = totalist.stream().collect(Collectors.toMap(new Function<Student, String>() {
			@Override
			public String apply(Student t) {
				return t.getName();
			}
		}, new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				return t.getScore();
			}
		}));
		for (Map.Entry<String, Integer> ent : toMap.entrySet()) {
			System.out.println(ent.getKey() + ", " + ent.getValue());

		}

		ConcurrentMap<String, Student.Sex> toConMap = totalist.stream()
				.collect(Collectors.toConcurrentMap(new Function<Student, String>() {
					@Override
					public String apply(Student t) {
						return t.getName();
					}
				}, new Function<Student, Student.Sex>() {
					@Override
					public Sex apply(Student t) {
						return t.getSex();
					}
				}));
		for (Map.Entry<String, Student.Sex> ent : toConMap.entrySet()) {
			System.out.println(ent.getKey() + ", " + ent.getValue());
		}
	}
}
