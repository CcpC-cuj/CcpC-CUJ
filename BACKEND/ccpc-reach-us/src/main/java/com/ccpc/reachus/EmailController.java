package com.ccpc.reachus;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
	
	@Autowired
	private EmailService sendEmailService;
	
	@Value("${spring.mail.username}")
	private String toEmail;
	
	@PostMapping("/reachus/submit")
	public String sendMail(@RequestBody MailMessage mailMessage) {
		String body=mailMessage.toPlainText();
		sendEmailService.sendEmail(toEmail,"New Form Submission from " + mailMessage.getName(), body);
		return "Sent Successfully!";
	}
}
