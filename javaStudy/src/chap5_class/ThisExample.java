package chap5_class;

class ThisUse {
	String name;
	String caller;

	ThisUse() {

	}

	ThisUse(String name) {
		this.name = name;
	}

	ThisUse(String name, String caller) {
		this("sss");
		this.caller = caller;
	}

}

public class ThisExample {
	

}
