package generic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
	public static void main(String[] args) {
		List<Teacher> list = Arrays.asList(new Teacher("Hong", 30), new Teacher("Hwang", 34));

		Consumer<Teacher> print = new Consumer<Teacher>() {
			@Override
			public void accept(Teacher t) {
				System.out.println(t.getName());
			}
		};
		showAllTeacher(list, print);

		showAllTeacher(list, (t) -> {
			System.out.println(t.getAge());
		});

		showAllTeacher(list, t -> System.out.println(t.getName() + ", " + t.getAge()));
	}

	static void showAllTeacher(List<Teacher> list, Consumer<Teacher> print) {
		for (Teacher teacher : list) {
			print.accept(teacher);
		}
	}
}

