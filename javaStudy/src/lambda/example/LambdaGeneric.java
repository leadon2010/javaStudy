package lambda.example;

@FunctionalInterface
interface Calculate<T> {
	T cal(T a, T b);
}

public class LambdaGeneric {
	public static void main(String[] args) {
		Calculate<Integer> ci = (a, b) -> a + b;
		System.out.println(ci.cal(3, 5));
	}

}
