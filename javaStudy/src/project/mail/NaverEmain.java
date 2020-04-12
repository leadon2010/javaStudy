package project.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class NaverEmain {
	public static void main(String[] args) throws AddressException, MessagingException {
		String host = "smtp.naver.com";
		final String user = "leadon@naver.com";
		final String passwd = "";

		String to = "cholee@yedam.ac";//

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, passwd);
			}
		});

		MimeMessage message = new MimeMessage(session);
		message.setFrom(new InternetAddress(user));
		message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

		// Subject
		message.setSubject("[Subject] Java Mail Test");
//			message.setSubject(title);

		// Text
		message.setText("Simple mail test..");
//			message.setText(content);

		// send the message
		Transport.send(message);
		System.out.println(to + " message sent successfully...");

	}
}
