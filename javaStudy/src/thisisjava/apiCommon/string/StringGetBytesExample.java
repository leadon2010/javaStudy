package thisisjava.apiCommon.string;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExample {
	public static void main(String[] args) {
		String str = "안녕하세요";
		byte[] bytes = str.getBytes();
		System.out.println("bytes.length: " + bytes.length);

		String str1 = new String(bytes);
		System.out.println("bytes->String: " + str1);

		try {
			byte[] byte1 = str.getBytes("EUC-KR");
			System.out.println("byte1.length: " + byte1.length);
			String str2 = new String(byte1, "EUC-KR");
			System.out.println("byte1-String: " + str2);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
			byte[] byte2 = str.getBytes("UTF-8");
			System.out.println("byte2.length: " + byte2.length);
			String str3 = new String(byte2, "UTF-8");
			System.out.println("byte2->String: " + str3);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("프로그램 종료.");

	}
}
