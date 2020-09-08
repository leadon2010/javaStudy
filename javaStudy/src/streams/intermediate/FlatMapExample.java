package streams.intermediate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

class Member {
	String name;
	int age;

	Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static List<Member> getMembers() {
		Member m1 = new Member("최재영", 25);
		Member m2 = new Member("민해주", 26);
		Member m3 = new Member("김상민", 27);
		Member m4 = new Member("김찬호", 28);
		Member m5 = new Member("임성은", 29);
		List<Member> members = Arrays.asList(m1, m2, m3, m4, m5);
		return members;
	}
}

public class FlatMapExample {

	public static void main(String[] args) {

		Member.getMembers().stream().flatMap(new Function<Member, Stream<String>>() {

			@Override
			public Stream<String> apply(Member t) {
				return Stream.of(t.name);
			}

		}).forEach(System.out::println);

		// 비교....
		Member.getMembers().stream().map(new Function<Member, String>() {
			@Override
			public String apply(Member t) {
				return t.name;
			}

		}).forEach(System.out::println);
	}
}
