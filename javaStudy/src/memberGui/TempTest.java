package memberGui;

import java.util.Iterator;
import java.util.Vector;

public class TempTest {

	public static void main(String[] args) {

		Vector<String> vector = new Vector<String>(4);

		System.out.println("vector의 크기 : " + vector.size());
		System.out.println("vector의 용량 : " + vector.capacity());

		vector.addElement("하이언");
		vector.addElement("아이유");
		vector.addElement("버스커");
		vector.addElement("소녀시대");
		vector.addElement("BTS");

		System.out.println("데이터 삽입 후 vector의 크기 : " + vector.size());
		System.out.println("데이터 삽입 후 vector의 용량 : " + vector.capacity());
		for (int i = 0; i < vector.size(); i++) {
			System.out.println("vector의 " + i + "번째 요소 : " + vector.elementAt(i));
		}

		String[] str = new String[4];
		for (int i = 0; i < str.length; i++) {
			str[i] = vector.elementAt(i);
		}

		for (String a : str) {
			System.out.println(a);
		}

		vector.removeAllElements();

		System.out.println("데이터 삭제 후 vector의 크기 : " + vector.size());
		System.out.println("데이터 삭제 후 vector의 용량 : " + vector.capacity());

		System.out.println("=====================================");

		Vector<String> v = new Vector<String>();
		System.out.println("벡터 생성 후 크기  " + v.size());

		v.addElement("강혜성");
		v.addElement("김혜성");
		v.add("안혜성");
		v.add("노혜성");
		v.add("구혜성");

		System.out.println("벡터 데티터 삽입  후 크기  " + v.size());
		System.out.println("벡터 전체 출력 : " + v);

		v.remove("강혜성");
		System.out.println(v.contains("김혜성"));

		Iterator<String> iter = v.iterator();
		while (iter.hasNext()) {
			String temp = iter.next();
			System.out.print(temp + ",");
		}
		System.out.println();
		System.out.println();

		for (int i = 0; i < v.size(); i++) {
			String temp = v.elementAt(i);
			System.out.print(temp + ",");

		}

	}
}
