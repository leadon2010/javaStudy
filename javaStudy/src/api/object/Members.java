package api.object;

public class Members implements Cloneable {
	String id;
	String name;
	String password;
	int age;
	boolean adult;

	public Members(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}

	public Members getMembers() {
		Members mem = null;
		try {
			mem = (Members) clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return mem;
	}


}
