package thisisjava.generic;

public class ChildProductStorageExample {
	public static void main(String[] args) {
		ChildProduct<Tv, String, String> product = new ChildProduct<>();
		product.setKind(new Tv());
		product.setModel("SmartTV");
		product.setCompany("Samsung");

		Storage<Tv> storage = new StorageImpl<>(100);
		storage.add(new Tv(), 0);
		storage.add(new Tv(), 1);
		Tv tv = storage.get(1);
		System.out.println(tv);
	}
}
