package classes.inherit;

public class UnivFriend extends Friend {
	private String major;

	public UnivFriend(String name, String phone, String major) {
		super(name, phone);
		this.major = major;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "name=" + super.getName() + " phone=" + super.getPhone() + " major=" + major;
	}

}
