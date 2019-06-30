package project.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.SocketException;

public class ReceiveThread extends Thread {

	private Socket m_Socket;

	@Override
	public void run() {
		super.run();

		try {
			BufferedReader tmpbuf = new BufferedReader(new InputStreamReader(m_Socket.getInputStream()));

			String receiveString;

			while (true) {
				receiveString = tmpbuf.readLine();

				System.out.println("상대방 : " + receiveString);
			}

		} catch (IOException e) {
		}
	}

	public void setSocket(Socket _socket) {
		m_Socket = _socket;
	}

}
