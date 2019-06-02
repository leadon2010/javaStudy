package zone;

interface InterfaceMan {
	String getInfo();
}

class UnivInterfaceMan implements InterfaceMan {
	String name;
	String major;

	UnivInterfaceMan(String name, String major) {
		this.name = name;
		this.major = major;
	}

	@Override
	public String getInfo() {
		return ("Intname is " + name + ", major is " + major);
	}

}

class CompInterfaceMan implements InterfaceMan {
	String name;
	String dept;

	CompInterfaceMan(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String getInfo() {
		return ("Intname is " + name + ", major is " + dept);
	}

}

public interface InterfaceExample {
	public static void main(String[] args) {
		InterfaceMan iman1 = new UnivInterfaceMan("name1", "major1");
		InterfaceMan iman2 = new CompInterfaceMan("name2", "major2");
		InterfaceMan[] iAry = new InterfaceMan[3];
		iAry[0] = iman1;
		iAry[1] = iman2;
		showMan(iAry);
	}

	static void showMan(InterfaceMan[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] != null)
				System.out.println(mAry[i].getInfo());
		}
	}
}
