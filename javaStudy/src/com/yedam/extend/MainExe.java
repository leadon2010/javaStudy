package com.yedam.extend;

public class MainExe {
	public static void main(String[] args) {
		String str1 = "abcdEfg";
		String str2 = "abcdefg";
		// System.out.println(str1.concat(str2));
		StringBuilder sb = new StringBuilder();
		sb.append("abcd");
		sb.append("efgh");
		sb.insert(1, "ttt");
		sb.replace(1, 4, "yyy");
		sb.delete(1, 4);
		System.out.println(sb.toString());
	}
}
