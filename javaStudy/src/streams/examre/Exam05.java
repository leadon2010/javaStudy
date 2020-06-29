package streams.examre;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exam05 {
	public static void main(String[] args) {
		List<Member> list = Arrays.asList(new Member("Hong", "Developer"), new Member("Shin", "Designer"),
				new Member("Kim", "Developer"));

		Map<String, List<String>> groupMap = list.stream().collect(
				Collectors.groupingBy(Member::getJob, Collectors.mapping(Member::getName, Collectors.toList())));

		System.out.println("[개발자]");
		groupMap.get("Developer").stream().forEach(s -> System.out.print(s + " "));
		System.out.println();
		System.out.println("[디자이너]");
		groupMap.get("Designer").stream().forEach(s -> System.out.print(s + " "));

	}
}
