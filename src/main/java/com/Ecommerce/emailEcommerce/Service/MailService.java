package com.Ecommerce.emailEcommerce.Service;


import com.Ecommerce.emailEcommerce.Model.MailStructure;
import com.Ecommerce.emailEcommerce.Model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;


    @Value("${spring.mail.username}")
    private String fromMail;


    //@Value("${registration.Email}")
   // private String toMail;
    public void sendMail(String mail, Registration registration){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(fromMail);
        simpleMailMessage.setSubject("Welcome to FamilyStore - Account Confirmation");
        //simpleMailMessage.setText(mailStructure.getMessage());
        String messageText = "Thank you for registering with FamilyStore. We are thrilled to welcome you to our platform!\n" +
                "\n" +
                "Your account has been successfully created, and you are now part of our community. You can start exploring our wide range of products and enjoy a seamless shopping experience.\n " +"\n"+"\n"+"\n"+"\n"+
                "Best Regards,\n FamilyStore Team";
        simpleMailMessage.setText(messageText);
        //simpleMailMessage.setText("your  are welcome to my family");

        simpleMailMessage.setTo(mail);


        mailSender.send(simpleMailMessage);

    }



}
