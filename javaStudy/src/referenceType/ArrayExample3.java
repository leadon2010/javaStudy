package referenceType;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] strAry = { "Java", "Java", new String("Java") };

		System.out.println(strAry[0] == strAry[1]);
		System.out.println(strAry[0] == strAry[2]);
		System.out.println(strAry[0].equals(strAry[2]));
		System.out.println();

		for (String str : strAry)
			System.out.println(str);
	}

}
