package ch11;

public class BuildString {
	public static void main(String[] args) {
		String apr = "abc";
		System.out.println(apr);
		
		StringBuilder apb = new StringBuilder("cde");
		apb.append("dddd");
		System.out.println(apb);
	}

}
