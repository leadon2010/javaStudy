package yoon.ch23;

public class PhoneBook {
	private String number;
	private String address;
	private String name;

	public PhoneBook(String number, String address, String name) {
		this.number = number;
		this.address = address;
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean equals(Object obj) {
		// return super.equals(arg0);
		if (obj instanceof PhoneBook) {
			if (this.name.equals(((PhoneBook) obj).getName()) && this.number.equals(((PhoneBook) obj).getNumber()))
				return true;
			else
				return false;
		} else
			return false;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("전화번호: " + number + "\n");
		sb.append("주소: " + address + "\n");
		sb.append("이름: " + name + "\n");
		return sb.toString();
	}

}// end of PhoneBook
