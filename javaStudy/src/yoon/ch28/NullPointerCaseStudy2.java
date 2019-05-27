package yoon.ch28;

import java.util.Optional;

class Friend4 {
	String name;
	Company4 cmp; // null 일 수 있음

	public Friend4(String n, Company4 c) {
		name = n;
		cmp = c;
	}

	public String getName() {
		return name;
	}

	public Company4 getCmp() {
		return cmp;
	}
}

class Company4 {
	String cName;
	ContInfo4 cInfo; // null 일 수 있음

	public Company4(String cn, ContInfo4 ci) {
		cName = cn;
		cInfo = ci;
	}

	public String getCName() {
		return cName;
	}

	public ContInfo4 getCInfo() {
		return cInfo;
	}

}

class ContInfo4 {
	String phone; // null 일 수 있음
	String adrs; // null 일 수 있음

	public ContInfo4(String ph, String ad) {
		phone = ph;
		adrs = ad;
	}

	public String getPhone() {
		return phone;
	}

	public String getAdrs() {
		return adrs;
	}

}

class NullPointerCaseStudy2 {
	public static void showCompAddr(Optional<Friend4> f) {
		String addr = f.map(Friend4::getCmp).map(Company4::getCInfo).map(ContInfo4::getAdrs)
				.orElse("There's no address information.");

		System.out.println(addr);
	}

	public static void main(String[] args) {

		ContInfo4 ci = new ContInfo4("321-444-577", "Republic of Korea");
		Company4 cp = new Company4("YaHo Co., Ltd.", ci);
		Friend4 frn = new Friend4("LEE SU", cp);

		// 친구 정보에서 회사 주소를 출력
		showCompAddr(Optional.of(frn));
	}
}