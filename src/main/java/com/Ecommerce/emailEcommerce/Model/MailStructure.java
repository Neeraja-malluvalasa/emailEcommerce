package com.Ecommerce.emailEcommerce.Model;


import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MailStructure {


    private String email;

    public MailStructure() {
    }

    public MailStructure(String email, String subject, String message) {
        this.email = email;

    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
