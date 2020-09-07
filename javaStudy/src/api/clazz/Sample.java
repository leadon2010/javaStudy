package api.clazz;

public class Sample {
	String fieldName;

	public String get() {
		return fieldName;
	}

	public void set(String fieldName) {
		this.fieldName = fieldName;
	}

	public static void main(String[] args) {
		try {

			Class clazz = Class.forName("api.clazz.Sample");
			Sample obj = (Sample) clazz.newInstance();
			System.out.println(obj.get());
			
			Math.max(3, 5);

		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
