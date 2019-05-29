package method;

class Computer {
	int sum1(int[] values) {
		int result = 0;
		for (int i = 0; i < values.length; i++) {
			result += values[i];
		}
		return result;
	}// end of sum1

	int sum2(int... values) {
		int result = 0;
		for (int a : values) {
			result += a;
		}
		return result;
	}// end of sum2
}

class Television {
	static String company = "Kakao";
	static String department = "Develop";
	static String member;
	static {
		member = company + "-" + department;
	}
}

class Triangle {
	double width;
	double height;

	Triangle() {

	}

	Triangle(double a) {
		this.width = a;
		this.height = a;
	}

	Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	double getWidth() {
		if (width != 0 && height != 0)
			return (width * height) / 2;
		else
			return 0;
	}

	double getWidth(double a) {
		return (a * a) / 2;
	}

	double getWidth(double h, double w) {
		return (h * w) / 2;
	}

}

public class ComputerExample {
	public static void main(String[] args) {
		int[] ary = { 1, 2, 3, 4, 5 };
		System.out.println("결과값은 : " + sum(ary));
		
		System.out.write(65);
		System.out.println();
	}

	static int sum(int[] ary) {
		int sum = 0;
		for (int i = 0; i < ary.length; i++) {
			sum += ary[i];
		}
		return sum;
	}
}
