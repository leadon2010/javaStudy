package zone;

abstract class AbstractMan {
	abstract String getInfo();
}

class UnivAbstractMan extends AbstractMan {
	String name;
	String major;

	UnivAbstractMan(String name, String major) {
		this.name = name;
		this.major = major;
	}

	@Override
	String getInfo() {
		return ("Absname is " + name + ", major is " + major);
	}

}

class ComAbstractMan extends AbstractMan {
	String name;
	String dept;

	ComAbstractMan(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}

	@Override
	String getInfo() {
		return ("Absname is " + name + ", dept is " + dept);
	}

}

public class AbstractManExample {
	public static void main(String[] args) {
		AbstractMan aman = new UnivAbstractMan("name1", "major1");
		// System.out.println(aman.getInfo());
		AbstractMan[] mAry = new AbstractMan[3];
		mAry[0] = new ComAbstractMan("name1", "dept1");
		mAry[1] = new ComAbstractMan("name2", "dept2");
		showMan(mAry);

	}

	static void showMan(AbstractMan[] mAry) {
		for (int i = 0; i < mAry.length; i++) {
			if (mAry[i] != null)
				System.out.println(mAry[i].getInfo());
		}
	}
}
