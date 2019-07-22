package thisisjava;

public class LagrangeInterpolation {

	public static int xToY(int xval[], int yval[], int xx) {

		int i, j, size = xval.length;
		int sum = 0, term;

		for (i = 0; i < size; ++i) {
			term = yval[i];
			for (j = 0; j < size; ++j) {
				if (i != j)
					term *= (xx - xval[j] / (xval[i] - xval[j]));
			}
			sum += term;
		}

		return sum;

	}

	public static int yToX(int x[], int y[], int yy) {
		int i, j, size = x.length;
		int term, sum = 0;

		for (i = 0; i < size; ++i) {
			term = x[i];
			for (j = 0; j < size; ++j) {
				if (i != j)
					term *= (yy - y[j]) / (y[i] - y[j]);
			}
			sum += term;
		}

		return sum;

	}

}