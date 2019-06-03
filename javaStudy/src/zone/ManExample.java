package zone;

import java.util.Scanner;

class Man {
	String name;

	Man() {

	}

	Man(String name) {
		this.name = name;
	}

	String getInfo() {
		return ("my name is " + this.name);
	}

}

class UnivMan extends Man {
	String major;

	UnivMan() {

	}

	UnivMan(String name, String major) {
		super(name);
		this.major = major;
	}

	@Override
	String getInfo() {
		return ("my name is " + super.name + ", major is " + major);
	}
}

class ComMan extends Man {
	String dept;

	ComMan() {

	}

	ComMan(String name, String dept) {
		super(name);
		this.dept = dept;
	}

	@Override
	String getInfo() {
		return ("my name is " + super.name + ", dept is " + dept);
	}
}

public class ManExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Man man1 = new UnivMan("name1", "major1");
		Man man2 = new ComMan("name2", "dept2");

		Man[] manAry = new Man[3];
		manAry[0] = man1;
		manAry[1] = man2;
		String name = null, major = null;
		
		while (true) {
			try {
				System.out.println("input UnivMan name, major...");
				name = sc.next();
				sc.nextLine();
				major = sc.next();
				sc.nextLine();
				System.out.println("input number type");
				int num = sc.nextInt();

				Man man3 = new UnivMan(name, major);
				insertMan(manAry, man3);

			} catch (Exception e) {
				System.out.println("retry input...");
				if (sc.hasNext())
					sc.next();
			}

			if (isFull(manAry))
				break;

		}

		showMan(manAry);

	}

	static boolean isFull(Man[] man) {
		for (int i = 0; i < man.length; i++)
			if (man[i] == null)
				return false;
		return true;
	}

	static void insertMan(Man[] mAry, Man man) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] == null) {
				mAry[i] = man;
				break;
			}
		}
	}

	static void showMan(Man[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] != null)
				System.out.println(mAry[i].getInfo());
		}
	}
}
