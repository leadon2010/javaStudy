package thisisjava.classes;

public class Friends {
	private String name;
	private String phone;

	public Friends() {
	}

	public Friends(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String showInfo() {
		return "name=" + name + ", phone=" + phone;
	}

	@Override
	public String toString() {
		return "Friends [name=" + name + ", phone=" + phone + "]";
	}

}
