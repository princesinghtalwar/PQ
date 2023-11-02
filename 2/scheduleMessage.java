import java.io.IOException;
import java.util.Properties;    
import javax.mail.*;    
import javax.mail.internet.*;

class scheduleMessage{
	
    public  void send(final String from,final String password,String to,String sub,String msg) throws IOException{  
          //Get properties object    
		  
		  //String host = "mail.acumentechnologies.co.in";
		  String host = "mail.acumentechnologies.co.in";
		  System.out.println("host:"+host);
		  String msgBody="";

				msgBody = "This Mail is from Outlook";
			
				Properties props = System.getProperties();
				props.put("mail.smtp.host", host);
				props.put("mail.smtp.port", "465");
//				props.put("mail.smtp.socketFactory.port", "465");
				props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
				props.put("mail.smtp.starttls.enable", "true");
				
				props.put("mail.smtp.auth", "true");
//				props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");  
//				props.put("mail.smtp.user", "prince@acumentechnologies.co.in");
//		        props.put("mail.smtp.pwd", "acumen@1");
//				props.put("mail.transport.protocol", "smtps");
//				props.put("mail.smtp.starttls.enable", "true");			
				props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
				props.put("mail.smtp.ssl.trust", "mail.acumentechnologies.co.in");
			
			//System.out.println("PROPERTIES :: "+props);
//			props.put("mail.smtp.connectiontimeout", "60000");
			// props.put("mail.acumentechnologies.starttls.enable", "true");			
			// prop.setProperty("mail.smtp.ssl.trust", "mail.acumentechnologies.co.in");		  

		  

         Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				System.out.println("Authenticating.....");
				return new PasswordAuthentication(from, password);
			}
		};
		Session session = Session.getDefaultInstance(props, auth);
//		Session session = Session.getInstance(props, auth);
		System.out.println("Authentication Successfully Done !!");
          //compose message    
          try {    
		    MimeMessage message = new MimeMessage(session);
			
			message.setFrom((Address)new InternetAddress(from));
			
			if(to.contains(",")) {
				System.out.println("Multiple Recipient");			
				String[] tolist = to.split(",");			
				InternetAddress[] recipientAddress = new InternetAddress[tolist.length];
				
				int counter = 0;
				for (String recipient : tolist) {
					recipientAddress[counter] = new InternetAddress(recipient.trim());
					counter++;
				}
				message.setRecipients(Message.RecipientType.TO, recipientAddress);
			}else {
				System.out.println("Single Recipient");
				InternetAddress recipientAddress = new InternetAddress();
				recipientAddress = new InternetAddress(to);
				message.setRecipient(Message.RecipientType.TO, recipientAddress);
			}
			
			// message.addRecipient(Message.RecipientType.TO, (Address)new InternetAddress(to));
			message.setSubject(sub);
			message.setContent(msgBody,"text/plain");
			System.out.println("Subject :: "+message.getSubject());
			System.out.println("Msg :: "+message.getContent());
      System.out.println("sending...");
//      Transport.send(message);
            Transport.send(message);
           System.out.println("message sent successfully");    
          } catch (MessagingException e) {
			  System.out.println(e);
			  e.printStackTrace();
		  }    
             
    }  
}