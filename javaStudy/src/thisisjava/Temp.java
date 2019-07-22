package thisisjava;

public class Temp {
	public static void main(String[] args) {
		RamdomXy xy = new RamdomXy();
		xy.play();
	}

	static int sum(int... arg) {
		int result = 0;
		for (int i = 0; i < arg.length; i++) {
			result += arg[i];
		}
		return result;

	}
}
