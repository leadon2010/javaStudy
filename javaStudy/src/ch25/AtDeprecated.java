package ch25;

interface Viewable {
	@Deprecated
	public void showIt(String str);

	public void brShowIt(String str);
}

class Viewer implements Viewable {

	@Override
	@SuppressWarnings("deprecation")
	public void showIt(String str) {
		System.out.println(str);
	}

	@Override
	public void brShowIt(String str) {
		System.out.println("[" + str + "]");
	}

}

public class AtDeprecated {
	public static void main(String[] args) {
		Viewable vi = new Viewer();
		vi.showIt("I am a god person");
		vi.brShowIt("I am a god person");
	}
}
