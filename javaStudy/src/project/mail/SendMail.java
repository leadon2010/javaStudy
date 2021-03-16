package project.mail;

import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.Scanner;

import javax.activation.CommandMap;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.activation.MailcapCommandMap;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.mail.internet.MimeUtility;

public class SendMail {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		String title, content;
		String[] toList = new String[5];

		System.out.println("제목을 입력하세요.");
		title = sc.nextLine();

		System.out.println("내용을 입력하세요.");
		content = sc.nextLine();
		
		System.out.println("첨부할 파일을 입력하세요.");
		String fname = sc.nextLine();

		String toUser = null;
		for (int i = 0; i < 5; i++) {
			System.out.println("수신인을 입력하세요.(최대 5명 까지 입력가능.)");
			if (sc.hasNext()) {
				toUser = sc.nextLine();
				if (toUser.equals("exit"))
					break;
				toList[i] = toUser;
			} else {
				System.out.println("수신인 끝");
			}
		}

		System.out.println("발송중......");
		for (String str : toList) {
//			System.out.println(str);
			if (str != null)
				sendMail(title, content, str, fname);
		}
		System.out.println("발송완료.");

	}

	public static void sendMail(String title, String content, String toUser, String fname) throws Exception {
		String host = "smtp.naver.com";
		final String user = " ";
		final String passwd = "";

		String to = toUser;//

		Properties props = new Properties();
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.auth", "true");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(user, passwd);
			}
		});

		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress(user));
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Subject
//			message.setSubject("[Subject] Java Mail Test");
			message.setSubject(title);

			// Text
//			message.setText("Simple mail test..");
//			message.setText(content);

			// send the message
//			Transport.send(message);
//			System.out.println(toUser + " message sent successfully...");

			Multipart mp = new MimeMultipart();
			MimeBodyPart mbp1 = new MimeBodyPart();
			mbp1.setText(content);
			mp.addBodyPart(mbp1);
			String filename = fname;//"d:\\interface.pdf";
			if (filename != null) {
				if (fileSizeCheck(filename)) {
					MimeBodyPart mbp2 = new MimeBodyPart();
					FileDataSource fds = new FileDataSource(filename);
					mbp2.setDataHandler(new DataHandler(fds));
					mbp2.setFileName(MimeUtility.encodeText(fds.getName(), "UTF-8", "B"));
					mp.addBodyPart(mbp2);
				} else {
					throw new Exception("file size overflow !");
				}
			}
			MailcapCommandMap mc = (MailcapCommandMap) CommandMap.getDefaultCommandMap();
			mc.addMailcap("text/html;; x-java-content-handler=com.sun.mail.handlers.text_html");
			mc.addMailcap("text/xml;; x-java-content-handler=com.sun.mail.handlers.text_xml");
			mc.addMailcap("text/plain;; x-java-content-handler=com.sun.mail.handlers.text_plain");
			mc.addMailcap("multipart/*;; x-java-content-handler=com.sun.mail.handlers.multipart_mixed");
			mc.addMailcap("message/rfc822;; x-java-content-handler=com.sun.mail.handlers.message_rfc822");
			CommandMap.setDefaultCommandMap(mc);
			message.setContent(mp);
			Transport.send(message);

		} catch (MessagingException e) {
			e.printStackTrace();
		}

	}

	protected static boolean fileSizeCheck(String filename) {
		if (new File(filename).length() > (1024 * 1024 * 2.5)) {
			return false;
		}
		return true;
	}
}
