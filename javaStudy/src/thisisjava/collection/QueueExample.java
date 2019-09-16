package thisisjava.collection;

import java.util.LinkedList;
import java.util.Queue;

class Message {
	String command;
	String to;

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}
}

public class QueueExample {
	public static void main(String[] args) {
		Queue<Message> messageQueue = new LinkedList<Message>();
		messageQueue.offer(new Message("sendMail", "홍길동"));
		messageQueue.offer(new Message("sendSMS", "신용수"));
		messageQueue.offer(new Message("sendkakaotalk", "박민수"));

		while (!messageQueue.isEmpty()) {
			Message message = messageQueue.poll();
			switch (message.command) {
			case "sendMail":
				System.out.println(message.to + " 님에게 메일을 보냅니다.");
				break;
			case "sendSMS":
				System.out.println(message.to + " 님에게 SMS을 보냅니다.");
				break;
			case "sendkakaotalk":
				System.out.println(message.to + " 님에게 카톡을 보냅니다.");
				break;
			}
		}
	}
}
