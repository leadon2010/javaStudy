package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Student {
	String name;
	int score;

	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
}

public class StreamExample2 {
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(new Student("Hong", 90), new Student("Park", 88), new Student("Choi", 80),
				new Student("Kwon", 87));

		// 전체 리스트를 보여주고 점수가 85점 이상인 요소의 갯수를 보여주는 처리.
		System.out.println(" iterator로 구현. ");
		int rCnt = 0;
		Iterator<Student> iter = list.iterator();
		while (iter.hasNext()) {
			Student student = iter.next();
			if (student.score >= 85) {
				System.out.println(Thread.currentThread().getName() + " : " + student.name + ", " + student.score);
				rCnt++;
			}

		}
		System.out.println("85점 이상: " + rCnt);
		System.out.println();

		System.out.println(" stream 으로 구현. ");
		Stream<Student> streams = list.stream();
		long iCnt = streams.filter(t -> {
			System.out.println("filter => " + Thread.currentThread().getName() + " : " + t.name + ", " + t.score);
			return t.score >= 85;
		}).peek(t -> System.out.println("peek   =>" + t.name + ", " + t.score)).count();
		System.out.println(" 결과: " + iCnt);
		System.out.println();

		System.out.println(" parrellelStream 으로 구현. ");
		Stream<Student> pStream = list.parallelStream();
		iCnt = pStream.filter(new Predicate<Student>() {
			int fCnt = 0;

			@Override
			public boolean test(Student t) {
				System.out.println(
						fCnt++ + " filter => " + Thread.currentThread().getName() + " : " + t.name + ", " + t.score);
				return t.score >= 85;
			}

		}).peek(new Consumer<Student>() {
			int pCnt = 0;

			@Override
			public void accept(Student t) {
				System.out.println(
						pCnt++ + " peek   => " + Thread.currentThread().getName() + " : " + t.name + ", " + t.score);
			}

		}).count();
		System.out.println(" 결과: " + iCnt);

	}

}
