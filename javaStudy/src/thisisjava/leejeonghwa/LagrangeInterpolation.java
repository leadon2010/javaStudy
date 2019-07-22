package thisisjava.leejeonghwa;

public class LagrangeInterpolation {
	// ramdomxy에서 뽑은 k개의 (x,y)값을 라그랑지 다항식에 넣어서 연산.
		//
		int intxy=new bval();

		public static int interpolation() {

			int n = bval.length - 1;
			int ft[] = (int[]) fi.clone();
			for (int i = 0; i < n; ++i) {
				for (int j = 0; j < n - i; ++j) {
					ft[j] = (aval - bval[j]) / (bval[i + j + 1] - bval[j]) * ft[j + 1]
							+ (aval - bval[i + j + 1]) / (bval[j] - bval[i + j + 1]) * ft[j];
				}
			}
			System.out.println(ft[0] + "집에가고싶다");
			return ft[0];
		}
		/*
		 * public static void main(String argv[]) {
		 * 
		 * 
		 * double xi[] = {0, 0.5, 1, 1.5, 2}; double fi[] = {1, 0.938470, 0.765198,
		 * 0.511828, 0.223891}; double x = 0.9; double f = aitken(x, xi, fi);
		 * System.out.println("Interpolated value: " + f); }
		 * 
		 * // Method to carry out the Aitken recursions.
		 * 
		 * public static double aitken(double x, double xi[], double fi[]) { int n =
		 * xi.length-1; double ft[] = (double[]) fi.clone(); for (int i=0; i<n; ++i) {
		 * for (int j=0; j<n-i; ++j) { ft[j] = (x-xi[j])/(xi[i+j+1]-xi[j])*ft[j+1]
		 * +(x-xi[i+j+1])/(xi[j]-xi[i+j+1])*ft[j]; } }
		 * 
		 * System.out.println(ft[0]+"집에가고싶다"); Object result = ft[0]%Z; return n;
		 * 
		 * }
		 */

	}
