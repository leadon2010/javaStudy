package generic;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {

	public static void main(String[] args) {

		showGeneric();

	} // end of main()

	public static void showGeneric() {
		List<String> list = new ArrayList<>();
		list.add("Hello");
		list.add("World");
		for (String str : list) {
			System.out.println(str.toString());
		}
	}

//	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void nonGeneric() {
		List list = new ArrayList();
		list.add("Hello");
		list.add("World");
		list.add(new Student("Hong"));

		for (int i = 0; i < list.size(); i++) {
			String result = (String) list.get(i);
			System.out.println(result);
		}
	}
}
