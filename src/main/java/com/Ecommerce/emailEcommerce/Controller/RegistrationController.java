package com.Ecommerce.emailEcommerce.Controller;


import com.Ecommerce.emailEcommerce.Model.Registration;
import com.Ecommerce.emailEcommerce.Service.MailService;
import com.Ecommerce.emailEcommerce.Service.OrderMailService;
import com.Ecommerce.emailEcommerce.Service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(value = "http://localhost:3000")
public class RegistrationController {

    @Autowired
    private RegistrationService serviceRepo;

    @Autowired
    private MailService mailService;





    @PostMapping("/addCustomer")
    public Registration postDetails(@RequestBody Registration registration)
    {
        mailService.sendMail(registration.getEmail(),registration);
        return serviceRepo.saveDetails(registration);
    }









    @GetMapping("/getAll")
    public List<Registration> getAllRegistration(){
        return serviceRepo.getAllRegistration();
    }


    //@CrossOrigin(value = "http://172.172.194.196:3000")
    @PostMapping("/login")
    public String requestLogin(@RequestBody Registration registration){
        try {
            Registration savedCus = serviceRepo.checkCredentials(registration);
            if(savedCus.getPassword().equals(registration.getPassword()))  return "{\"email\":\""+savedCus.getEmail()+"\"}";
            else return "{\"message\":\"Invalid Password\"}";
        } catch (NullPointerException e) {
            return "{\"message\":\"User doesn't exist\"}";
        }
    }

    /*@PostMapping("/send/{mail}")
    public void SendOrderConfirmation(@RequestBody Registration registration)
    {
        mailService.sendOrderMail(registration.getEmail(),registration);


    }


    @PostMapping("/Sendmail")
    public String sendOrderMail(@RequestBody Registration registration){

        orderMailService.sendOrderMail(registration);

        return "successfully sent the mail.....";

    }

     */




}
