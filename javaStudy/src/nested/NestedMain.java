package nested;

public class NestedMain {
	public static void main(String[] args) {
		NestedClass nc = new NestedClass();

		NestedClass.InstanceClass ic = nc.new InstanceClass();

		ic.instanceMethod();
	}
}
