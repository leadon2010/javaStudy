package thisisjava.apiCommon;

public class Wrapper {
	public static void main(String[] args) {
		Integer iObj = new Integer(10);
		iObj += 20;
		System.out.println(iObj);
		Double dObj = new Double(3.45);
		dObj += 2.2;
		System.out.println(dObj);
		dObj = new Double("3.3342343245324");
		System.out.println(dObj);
	}
}
