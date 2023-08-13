package com.proyectotesis.tesis.correo;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class enviarCorreo{
    private final JavaMailSender mailSender;

    public enviarCorreo(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(String to, String subject, String content) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to);
        message.setSubject(subject);
        message.setText(content);
        mailSender.send(message);
    }
    
    public void sendHtmlEmail(String to, String subject, String content) {
        MimeMessage message = mailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(message, true);
            helper.setTo(to);

            String[] bccAddresses = {"n00206599@upn.pe", "sebastianquispemolina@gmail.com", "sebas24quispe@gmail.com"};
            helper.setBcc(bccAddresses);
            
            helper.setSubject(subject);
            helper.setText(content, true); // El segundo argumento true indica que el contenido es HTML
            mailSender.send(message);
        } catch (MessagingException e) {
            System.out.println("Ocurrió un error al enviar el correo: " + e.getMessage());
        }
    }
    
}
