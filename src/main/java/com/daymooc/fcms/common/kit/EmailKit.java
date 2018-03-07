
package com.daymooc.fcms.common.kit;

import com.jfinal.log.Log;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.security.Security;
import java.util.Properties;

/**
 * 邮件发送工具类
 */
public class EmailKit {
	
	private static final Log log = Log.getLog(EmailKit.class);
	
	public static String sendEmail(String fromEmail, String toEmail, String title, String content) {
		return sendEmail(null, fromEmail, null, toEmail, title, content);
	}
	
	public static String sendEmail(String emailServer, String fromEmail, String password, String toEmail, String title, String content) {
		try {
			Properties properties = new Properties();
			properties.setProperty("mail.transport.protocol", "smtp");// 发送邮件协议
			properties.setProperty("mail.smtp.host", "smtp.szixing.cn");
			properties.setProperty("mail.smtp.auth", "true");// 需要验证
			properties.setProperty("mail.smtp.port", "465");
			properties.setProperty("mail.smtp.socketFactory.port", "465");
			properties.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
			properties.setProperty("mail.smtp.socketFactory.fallback", "false");
			final String username1 = "info@szixing.cn";
			final String password1 = "szx123!@#";
			// 后台输出邮件发送的过程
			Session session = Session.getInstance(properties,
					new Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication(username1,
									password1);
						}
					});
			// 邮件信息
			Message messgae = new MimeMessage(session);
			messgae.setFrom(new InternetAddress("info@szixing.cn"));// 设置发送人
			messgae.setText(content);// 设置邮件内容
			messgae.setSubject(title);// 设置邮件主题
			// 发送邮件
			Transport tran = session.getTransport();
			tran.connect("smtp.szixing.cn", username1, password1);// 连接到新浪邮箱服务器
			tran.sendMessage(messgae, new Address[] { new InternetAddress(toEmail) });// 设置邮件接收人
			tran.close();
		} catch (Exception e) {
			log.info("邮件发送失败==》",e);
		}
		return "";
	}

}
		
		
	
	


