package stream.mapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMappingExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("java8 lambda", "stream mapping");

//		list.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(text -> System.out.println(text));

		Stream<String> stream = list.stream();
		Stream<String> map = stream.flatMap(data -> Arrays.stream(data.split(" ")));
		map.forEach(s -> System.out.println(s));
		System.out.println();

		list = Arrays.asList("10,20,30", "40,50,60");
		list.stream().flatMapToInt(data -> {
			String[] strArr = data.split(",");
			int[] intArr = new int[strArr.length];
			for (int i = 0; i < strArr.length; i++) {
				System.out.println(strArr[i].trim());
				intArr[i] = Integer.parseInt(strArr[i].trim());
			}
			return Arrays.stream(intArr);
		}).forEach(n -> System.out.println(n));
	}
}
