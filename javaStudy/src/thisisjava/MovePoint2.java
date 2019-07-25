package thisisjava;

public class MovePoint2 {
	public static void main(String[] args) {
		int[] scores = new int[5];
		int[] results = new int[5];

		scores = new int[] { 9, 8, 7, 6, 5 };
		int temp = 0;
		for (int i = 0; i < scores.length - 1; i++) {
			for (int j = 0; j < scores.length - 1; j++) {
				if (scores[j] > scores[j + 1]) {
					temp = scores[j];
					scores[j] = scores[j + 1];
					scores[j + 1] = temp;
				}
			}
			for (int k = 0; k < scores.length; k++)
				System.out.print(scores[k] + " ");
			System.out.println();
		}

	}

}
