package humanResources;

import java.util.Formatter;

public class HumanDTO {
	String hNo;
	String hName;
	String hBirth;
	String hPhone;
	String hAddress;
	String hComments;

	public String gethNo() {
		return hNo;
	}

	public void sethNo(String hNo) {
		this.hNo = hNo;
	}

	public String gethName() {
		return hName;
	}

	public void sethName(String hName) {
		this.hName = hName;
	}

	public String gethBirth() {
		return hBirth;
	}

	public void sethBirth(String hBirth) {
		this.hBirth = hBirth;
	}

	public String gethPhone() {
		return hPhone;
	}

	public void sethPhone(String hPhone) {
		this.hPhone = hPhone;
	}

	public String gethAddress() {
		return hAddress;
	}

	public void sethAddress(String hAddress) {
		this.hAddress = hAddress;
	}

	public String gethComments() {
		return hComments;
	}

	public void sethComments(String hComments) {
		this.hComments = hComments;
	}

	@Override
	public String toString() {

		return "HumanDTO [hNo=" + hNo + ", hName=" + hName + ", hBirth=" + hBirth + ", hPhone=" + hPhone
				+ ", hAddress=" + hAddress + ", hComments=" + hComments + "]";
	}

	public Formatter toString1() {
		Formatter formatter = new Formatter();
		return formatter.format("%5s %9s\t %9s\t %11s\t %12s\t %9s", hNo, hName, hBirth, hPhone, hAddress, hComments);
	}

	public void showTitle() {
		System.out.println("================================================================================");
		System.out.println("HNo()      Name\t     Birth\t       Phone\t      Address\t  Contents");
		System.out.println("================================================================================");
	}

	public void showMenu() {
		System.out.println("================================================================================");
		System.out.println("[1-5]중 선택하세요.");
		System.out.println("1:리스트보기 2:등록하기 3:수정하기 4:삭제하기 5:종료하기");
		System.out.println("================================================================================");
	}

}
