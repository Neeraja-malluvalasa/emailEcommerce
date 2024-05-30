package com.Ecommerce.emailEcommerce.Controller;


import com.Ecommerce.emailEcommerce.Model.MailStructure;
import com.Ecommerce.emailEcommerce.Model.Registration;

import com.Ecommerce.emailEcommerce.Service.MailService;
import com.Ecommerce.emailEcommerce.Service.OrderMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping
public class MailController {

   // @Autowired
    //private MailService mailService;

    @Autowired
    private OrderMailService orderMailService;

//    @PostMapping("/send/{mail}")
//    public String sendMail(@PathVariable String mail, @RequestBody Registration registration){
//
//        mailService.sendMail(mail,registration);
//
//        return "successfully sent the mail.....";
//
//    }






    //@CrossOrigin(value = "http://localhost:3000")
    @PostMapping("/orderMail")
    public String sendOrderMail(MailStructure mailStructure){

        orderMailService.sendOrderMail(mailStructure);

        return "successfully sent the mail.....";

    }



}
