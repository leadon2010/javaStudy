package stream.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientExample {
	public static void main(String[] args) {
		Socket socket = null;
		socket = new Socket();
		System.out.println("request connection...");
		try {

			socket.connect(new InetSocketAddress("localhost", 5001));
			System.out.println("connection success.");

		} catch (IOException e) {
			e.printStackTrace();
		}

		byte[] bytes = null;
		String message = null;

		try {

			OutputStream os = socket.getOutputStream();
			message = "Hello, World";
			bytes = message.getBytes("UTF-8");
			os.write(bytes);
			os.flush();
			System.out.println("sending success.");
			
			InputStream is = socket.getInputStream();
			bytes = new byte[100];
			int readByte = is.read(bytes);
			message = new String(bytes, 0, readByte, "UTF-8");
			System.out.println("receiving success: " + message);
			
			is.close();
			os.close();

		} catch (IOException e1) {
			e1.printStackTrace();
		}

		if (!socket.isClosed()) {
			try {
				socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	} // end of main
} // end of class
