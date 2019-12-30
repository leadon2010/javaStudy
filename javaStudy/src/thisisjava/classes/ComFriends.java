package thisisjava.classes;

public class ComFriends extends Friends {

	String company;
	String dept;

	public ComFriends(String name, String phone, String company, String dept) {
		super(name, phone);
		this.company = company;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "ComFriends [company=" + company + ", dept=" + dept + "]";
	}

}
