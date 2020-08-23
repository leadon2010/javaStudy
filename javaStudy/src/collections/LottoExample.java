package collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LottoExample {
	public static void main(String[] args) {
		lottoArray();
	}

	public static void mapOfMethod() {

	}

	public static void lottoArray() {
		// 배열을 활용한 중복번호 제거하는 로또 번호 생성기.
		int[] lottoAry = new int[5];
		int numCnt = 0;
		while (true) {
			int newNum = (int) (Math.random() * 45) + 1;
			int i = 0;
			for (; i < lottoAry.length; i++) {
				if (lottoAry[i] == newNum) {
					break;
				}
			}
			if (i != 5) // 중복값이면 5가 안되니까 다시 만들어주도록 continue.
				continue;

			if (numCnt == 5) // 5개 번호를 다 만들었으면 반복문을 빠져나온다.
				break;
			else
				lottoAry[numCnt++] = newNum;

		}
		for (int i = 0; i < lottoAry.length; i++)
			System.out.printf("%3d", lottoAry[i]);

	}

	public static void lotto() {
		// 중복제거하는 set을 활용한 로또 번호 생성기.
		Set<Integer> set = new HashSet<>();

		while (true) {
			set.add(new Integer((int) (Math.random() * 45) + 1));
			if (set.size() == 15)
				break;
		}

		for (Integer itg : set) {
			System.out.printf("%3d", itg);
		}
	}
}
