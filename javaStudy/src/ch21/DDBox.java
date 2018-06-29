package ch21;

class DblBox<U, D> {
	private U uu;
	private D dd;

	public void set(U u, D d) {
		uu = u;
		dd = d;
	}

	@Override
	public String toString() {
		return uu + "\n" + dd;
	}

}

public class DDBox {

	public static void main(String[] args) {
		DBox<String, Integer> box1 = new DBox<>();
		box1.set("Apple", 25);
		DBox<String, Integer> box2 = new DBox<>();
		box2.set("Orange", 33);

		DblBox<DBox<String, Integer>, DBox<String, Integer>> dblbox = new DblBox<>();
		dblbox.set(box1, box2);
		System.out.println(dblbox);

	}

}
