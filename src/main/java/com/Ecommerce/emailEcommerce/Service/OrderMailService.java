package com.Ecommerce.emailEcommerce.Service;

import com.Ecommerce.emailEcommerce.Model.Registration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class OrderMailService {

    @Autowired
    private JavaMailSender mailSender;


    @Value("${spring.mail.username}")
    private String fromMail;

    public void sendOrderMail(String mail, Registration registration){

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(fromMail);
        simpleMailMessage.setSubject("Order Confirmation.....");
        //simpleMailMessage.setText(mailStructure.getMessage());
        String OrderText = "If you have any questions or concerns regarding your order, please feel free to contact us at nmalluvalasa@gmail.com.\n" +
                "\n" +
                "Thank you again for choosing us. We look forward to serving you again soon!\n" +
                "\n" +"\n"+"\n"+"\n"+"\n"+"\n"+
                "Best regards,\n" +
                "FamilyStore\n" +
                "\n";
        simpleMailMessage.setText(OrderText);
        //simpleMailMessage.setText("your  are welcome to my family");

        simpleMailMessage.setTo(mail);


        mailSender.send(simpleMailMessage);

    }
}
