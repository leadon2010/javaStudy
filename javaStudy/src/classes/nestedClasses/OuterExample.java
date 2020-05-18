package classes.nestedClasses;

public class OuterExample {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.NestedClass nested = outer.new NestedClass();
		nested.print();
	}
}
