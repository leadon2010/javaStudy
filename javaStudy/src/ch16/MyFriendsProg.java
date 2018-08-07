package ch16;

class Friend {
	private String name;
	private String phone;

	public Friend(String na, String ph) {
		name = na;
		phone = ph;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("전화: " + phone);
	}
}

class UnivFriend extends Friend {
	private String major;
	// private String name;
	// private String phone;

	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		// name = na;
		// phone = ph;
		major = ma;
	}

	public void showInfo() {
		// System.out.println("이름: " + name);
		// System.out.println("전화: " + phone);
		super.showInfo();
		System.out.println("전공: " + major);
	}
}

class CompFriend extends Friend {
	// private String name;
	// private String phone;

	private String department;

	public CompFriend(String na, String de, String ph) {
		// name = na;
		// phone = ph;
		super(na, ph);
		department = de;
	}

	public void showInfo() {
		// System.out.println("이름: " + name);
		// System.out.println("전화: " + phone);
		super.showInfo();
		System.out.println("부서: " + department);
	}

}

public class MyFriendsProg {
	public static void main(String[] args) {
		Friend[] urf = new Friend[10];
		int ucnt = 0;
		urf[ucnt++] = new UnivFriend("LEE", "Computer", "1111-1111");
		urf[ucnt++] = new UnivFriend("KIM", "Electric", "2222-2222");
		urf[ucnt++] = new UnivFriend("YOON", "Electronic", "3333-3333");
		// Friend[] crf = new CompFriend[3];
		// int ccnt = 0;
		urf[ucnt++] = new CompFriend("PARK", "Account", "4444-4444");
		urf[ucnt++] = new CompFriend("KWON", "Developer", "5555-5555");
		urf[ucnt++] = new CompFriend("CHOI", "RND 1", "6666-6666");
		// for (int i = 0; i < crf.length; i++) {
		// crf[i].showInfo();
		// System.out.println();
		// }
		for (int i = 0; i < ucnt; i++) {
			urf[i].showInfo();
			System.out.println();
		}
	}

}
