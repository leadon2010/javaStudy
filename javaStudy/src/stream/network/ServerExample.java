package stream.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {

		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001));
			while (true) {
				System.out.println("waiting for connection...");
				Socket socket;
				socket = serverSocket.accept();
				InetSocketAddress isa = (InetSocketAddress) socket.getRemoteSocketAddress();
				System.out.println("accepted connection..." + isa.getHostName());

				byte[] bytes = null;
				String message = null;

				InputStream is = socket.getInputStream();
				bytes = new byte[100];

				int readByte = is.read(bytes);
				message = new String(bytes, 0, readByte, "UTF-8");
				System.out.println("receiving data " + message);

				OutputStream os = socket.getOutputStream();
				message = "Hello, Client";
				bytes = message.getBytes();
				os.write(bytes);
				os.flush();
				System.out.println("sending success.");

				is.close();
				os.close();
//				socket.close();
			}
		} catch (IOException e) {
			if (!serverSocket.isClosed()) {
				try {
					serverSocket.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}

			}
		} // end of try

	} // end of main
} // end of class
