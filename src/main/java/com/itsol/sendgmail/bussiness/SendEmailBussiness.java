package com.itsol.sendgmail.bussiness;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
@Service
public class SendEmailBussiness {

    @Autowired
    private JavaMailSender sender;

    public boolean sendEmail(String emailAddress){
       boolean check;
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setTo(emailAddress);
            helper.setText("How are you?");
            helper.setSubject("Hi");
            sender.send(message);
            check = true;
        } catch (MessagingException e) {
            e.printStackTrace();
            check = false;
        }

        return check;
    }
}
