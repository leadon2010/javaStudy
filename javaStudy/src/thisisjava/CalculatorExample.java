package thisisjava;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CalculatorExample {
	public static void main(String[] args) {
//		Calculator cal = new Calculator();
//		cal.execute();
		String str = "";
		StringBuilder strb = new StringBuilder();
		for (int i = 1; i < 100; i++) {
			strb.append(i);
		}
		System.out.println(strb);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 M월 dd일");
		System.out.println(sdf.format(new Date(2019, 10, 10)));

		String javaStr = "모든 프로그램은 자바 언어로 개발될 수 있다.";
		System.out.println(javaStr.replace("자바", "java"));

		int index = javaStr.indexOf("자바");
		System.out.println(index);

		String strSplit = "아이디, 이름, 패스워드";
		System.out.println("========split=========");
		String[] split = strSplit.split(",");
		for (String sp : split) {
			System.out.println(sp.trim());
		}
		System.out.println("========token1=========");
		StringTokenizer stk = new StringTokenizer(strSplit, ", ");
		int stkCnt = stk.countTokens();
		for (int i = 0; i < stkCnt; i++) {
			System.out.println(stk.nextToken());
		}
		System.out.println("========token2=========");
		stk = new StringTokenizer(strSplit, ", ");
		while (stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		int intData2 = 150;

	}
}

class Key {
	int number;

	Key(int number) {
		this.number = number;
	}

	@Override
	public int hashCode() {
		System.out.println("sss".hashCode());
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Key kkk = (Key) obj;
		if (this.number != kkk.number)
			return true;
		else
			return false;
//		return this.number != kkk.number;
	}

}