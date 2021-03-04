package annotations;

public class Service {

	@PrintAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}

	@PrintAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}

	@PrintAnnotation(value = "#", number = 28)
	public void method3() {
		System.out.println("실행 내용3");
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
