package streams.collect.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class MailExample {
	public static void main(String[] args) {
		naverMailSend();
	}

	public static void naverMailSend() {
		String host = "smtp.naver.com";
		String user = "leadon@naver.com";
		String passwd = "^Y&u8i9o0p";

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", 587);
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentification() {
				return new PasswordAuthentication(user, passwd);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress("cholee@yedam.ac"));
			message.setSubject("mail test");
			message.setText("successful");
			Transport.send(message);
			System.out.println("mail send!!");
		} catch (AddressException e) {
			e.printStackTrace();
		} catch (MessagingException e) {
			e.printStackTrace();
		}
		System.out.println("end of mail.");
	}
}
