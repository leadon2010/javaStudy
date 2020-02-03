package thisisjava.classes;

class Television {
	static String company = "Google";
	static String browser = "chrome";
	static String version = "1.1";
	static String info;

	// 인스턴스 필드
	String programInfo;

	static {
		info = browser + "-" + version + ".ver";
	}

	// 인스턴스 메소드
	void setProgramInfo(String info) {
		programInfo = info;
	}

	String getProgramInfo() {
		return programInfo;
	}

	// 정적 메소드
	static String getBrowser() {
		return browser;
	}

	static String getVersion() {
		return version;
	}

	static {
		// programInfo = "Google Corporation.";
		// setProgramInfo("Google Corporation");
		info = getBrowser() + "-" + getVersion();
	}

}

public class TelevisionExample {
	public static void main(String[] args) {
		System.out.println(Television.company + ", " + Television.info);

		// 싱글톤 설명 ===> SingletonExample.java

	}
}
