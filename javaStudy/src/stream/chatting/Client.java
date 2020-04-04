package stream.chatting;

import java.io.InputStream;
import java.net.Socket;

public class Client {
	Socket socket;

	Client(Socket socket) {
		this.socket = socket;
		receive();
	}

	void receive() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				while(true) {
					byte[] byteArr = new byte[100];
					InputStream inputStream = socket.getInputStream();
					int readByteCount = inputStream.read(byteArr);
					
				}
			}
			
		}
	}

	void send(String data) {

	}
}
