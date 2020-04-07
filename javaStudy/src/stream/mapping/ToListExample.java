package stream.mapping;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListExample {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 10, Student.Sex.MALE),
				new Student("Hwang", 9, Student.Sex.FEMALE), //
				new Student("Choi", 8, Student.Sex.MALE), //
				new Student("Park", 7, Student.Sex.FEMALE));

		Stream<Student> maleStream = list.stream().filter(s -> s.getSex() == Student.Sex.MALE);
		Collector<Student, ?, List<Student>> collector = Collectors.toList();
		List<Student> maleList = maleStream.collect(collector);
		maleList.stream().forEach(s -> System.out.println(s.getName() + "," + s.getScore() + ", " + s.getSex()));

		HashSet<Student> femaleSet = list.stream().filter(s -> s.getSex() == Student.Sex.FEMALE)
				.collect(Collectors.toCollection(HashSet::new));
		femaleSet.stream().forEach(s -> System.out.println(s.getName() + "," + s.getScore()));

	}
}
