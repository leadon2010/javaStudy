package thisisjava.apiCommon.system;

public class SystemEnvExample {
	public static void main(String[] args) {
		// 환경변수 정보 가져오기.
		String javaHome = System.getenv("JAVA_HOME");
		System.out.println("JAVA_HOME: " + javaHome);
	}
}
