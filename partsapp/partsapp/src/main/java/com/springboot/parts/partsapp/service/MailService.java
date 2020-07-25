package com.springboot.parts.partsapp.service;

import java.io.File;

import javax.mail.Message;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.MailException;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	@Autowired
	JavaMailSender javaMailSender;	
	public boolean sendEmail(String to, String subject, String body, String fileToAttach) 
	{
	    MimeMessagePreparator preparator = new MimeMessagePreparator() 
	    {
	    	@Override
			public void prepare(MimeMessage mimeMessage) throws Exception {
	            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            mimeMessage.setFrom(new InternetAddress("tttt@gmail.com"));
	            mimeMessage.setSubject(subject);
	            mimeMessage.setText(body);          
	            FileSystemResource file = new FileSystemResource(new File(fileToAttach));
	            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
	            helper.addAttachment("Reports.pdf", file);
	        }
	    };	     
	    try {
	    	javaMailSender.send(preparator);
	    	return true;
	    }
	    catch (MailException ex) {
	        System.err.println(ex.getMessage());
	        return false;
	    }	    
	}
}
