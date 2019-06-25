package stream;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {
	public static void main(String[] args) {
		List<String> inputList1 = Arrays.asList("java8 lambda", "stream mapping");
		inputList1.stream().flatMap(data -> Arrays.stream(data.split(" "))).forEach(System.out::println);
		System.out.println();

		List<String> inputList2 = Arrays.asList("10,20,30", "40,50,60");
		inputList2.stream().flatMapToInt(data -> {
			String[] strAry = data.split(",");
			int[] intAry = new int[strAry.length];
			for (int i = 0; i < intAry.length; i++) {
				intAry[i] = Integer.parseInt(strAry[i]);
			}
			return Arrays.stream(intAry);
		}).forEach(System.out::println);

	}
}
