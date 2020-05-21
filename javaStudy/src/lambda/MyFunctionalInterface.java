package lambda;

@FunctionalInterface
public interface MyFunctionalInterface {
	public String run(String str, String str2);
//	public void method2();
}

@FunctionalInterface
interface SummariesInterface {
	public int sum(int x, int y);
}
