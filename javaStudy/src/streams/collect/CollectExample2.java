package streams.collect;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class CollectExample2 {
	public static void main(String[] args) {
		List<Student> totalist = Arrays.asList(new Student("Hong1", 23, Student.Sex.MALE),
				new Student("Hong2", 23, Student.Sex.FEMALE), new Student("Hong3", 23, Student.Sex.MALE),
				new Student("Hong4", 23, Student.Sex.FEMALE));

		MaleStudent maleStudent = totalist.parallelStream().filter(s -> s.getSex() == Student.Sex.MALE)
				.collect(new Supplier<MaleStudent>() {
					@Override
					public MaleStudent get() {
						return new MaleStudent();
					}
				}, new BiConsumer<MaleStudent, Student>() {
					@Override
					public void accept(MaleStudent t, Student u) {
						t.accumulate(u);
					}
				}, new BiConsumer<MaleStudent, MaleStudent>() {
					@Override
					public void accept(MaleStudent t, MaleStudent u) {
						t.combine(u);
					}
				});

		maleStudent.getList().stream().forEach(s -> System.out.println(s.getName()));

	}
}
