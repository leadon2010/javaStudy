package streams.collect;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

class MaleStudent {
	private List<Student> list;

	public MaleStudent() {
		list = new ArrayList<>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent()");
	}

	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate()");
	}

	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}

	public List<Student> getList() {
		return this.list;
	}
}

// 병렬처리 호출.
public class CollectExample2 {
	public static void main(String[] args) {
		List<Student> totalist = Arrays.asList(//
				new Student("Hong1", 23, Student.Sex.MALE), //
				new Student("Hong2", 33, Student.Sex.FEMALE), //
				new Student("Hong3", 43, Student.Sex.MALE), //
				new Student("Hong4", 53, Student.Sex.FEMALE), //
				new Student("Hong5", 23, Student.Sex.MALE), //
				new Student("Hong6", 33, Student.Sex.FEMALE), //
				new Student("Hong7", 43, Student.Sex.MALE), //
				new Student("Hong8", 43, Student.Sex.MALE), //
				new Student("Hong9", 53, Student.Sex.FEMALE)//
		);

		MaleStudent maleStudent = totalist.parallelStream().filter(s -> s.getSex() == Student.Sex.FEMALE)
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
