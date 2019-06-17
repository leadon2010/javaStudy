package api;

import java.text.DecimalFormat;

public class DecimalFormatExample {
	public static void main(String[] args) {
		double num = -1234567.89;
		DecimalFormat df = new DecimalFormat("+#,###.##; -#,###.##");
		System.out.println(df.format(num));
	}
}
