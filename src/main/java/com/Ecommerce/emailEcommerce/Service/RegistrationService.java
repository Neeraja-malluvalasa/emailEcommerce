package com.Ecommerce.emailEcommerce.Service;

import com.Ecommerce.emailEcommerce.Model.Registration;


import com.Ecommerce.emailEcommerce.Repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepo registrationRepo;




    public Registration saveDetails(Registration registration) {

        return registrationRepo.save(registration);
    }





    public List<Registration> getAllRegistration() {

        return  registrationRepo.findAll();


    }


    public Registration checkCredentials(Registration registration){
        return registrationRepo.findByEmail(registration.getEmail());
    }

}
