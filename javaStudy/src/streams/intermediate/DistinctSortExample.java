package streams.intermediate;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Stream;

public class DistinctSortExample {
	static int cnt = 0;

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Hong", 20), 
				new Student("Hwang", 30), new Student("Park", 25));

//		System.out.println("---- distinct ----");
//		students.stream().distinct().forEach(t -> System.out.println(t));

//		System.out.println("---- sorted ----");
//		students.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);

		System.out.println("----- compare funcion----");
		students.stream().sorted(Comparator.comparing(new Function<Student, Integer>() {
			@Override
			public Integer apply(Student t) {
				cnt++;
				System.out.print("cnt: " + cnt + " => " + t.getName() + "-" + t.getScore() + "\t");
				return t.getScore();
			}

		})).forEach(new Consumer<Student>() {
			@Override
			public void accept(Student t) {
				System.out.print("\nforEach: " + t);
			}

		});

//		System.out.println("-------- student -----------");
//		students.stream().sorted(new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				if (o1.getScore() < o2.getScore()) {
//					return -1;
//				} else if (o1.getScore() == o2.getScore()) {
//					return o1.getName().compareTo(o2.getName());
//				} else {
//					return 1;
//				}
//			}
//		}).forEach(System.out::println);

//		System.out.println("-------------- person -----------------");
//		Stream.of(new Person("Hong", 20), new Person("Hwang", 30), new Person("Park", 25))
//				.sorted((o1, o2) -> o1.getAge() - o2.getAge()).forEach(System.out::println);
	}
}
