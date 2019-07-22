package thisisjava.newp;

public class LagrangeInterpolation {
	// ramdomxy에서 뽑은 k개의 (x,y)값을 라그랑지 다항식에 넣어서 연산.

	//

	public static int interpolation(int[] rAry) {
		int[] intxy;
		intxy = rAry;
		int n = rAry.length - 1;
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

	public static void main(String[] args) {
		RamdomXy inputxy = new RamdomXy();
		int[] r = inputxy.ramdomvalue();

		interpolation(r);

	}

}