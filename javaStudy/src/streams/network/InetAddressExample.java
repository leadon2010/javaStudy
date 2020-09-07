package streams.network;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressExample {
	public static void main(String[] args) throws IOException {
		InetAddress ia = InetAddress.getLocalHost();
		System.out.println("my computer ip address: " + ia.getHostAddress());

		InetAddress[] iaArr = InetAddress.getAllByName("www.naver.com");
		for (InetAddress add : iaArr) {
			System.out.println(add.getHostAddress());
		}
	}
}
