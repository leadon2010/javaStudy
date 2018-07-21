package ch04;

public class Zexm {
	public static void main(String[] args) {
		int num = 7;
		System.out.println(~num + 1);
		System.out.println("==================");
		int cnt = 15678;
		int m = 0;
		int[] arr = new int[16];
		for (int i = 0; i < 16; i++) {
			arr[i] = 0;
		}
		int j = 0;
		while (cnt > 0) {
			arr[j++] = cnt % 2;
			cnt = cnt / 2;
		}
		for (int i = 15; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
