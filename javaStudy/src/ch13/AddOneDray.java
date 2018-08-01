package ch13;

public class AddOneDray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		addOneDarr(arr, 3);
		for (int i : arr)
			System.out.println(arr.toString());
	}

	public static void addOneDarr(int[] arr, int add) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] += add;
			System.out.println("i : " + i + " -> " + arr[i]);
		}
	}
}
