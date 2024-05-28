package com.Ecommerce.emailEcommerce.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "CustomerDetails")
public class Registration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private long id;
    @Column(name="NAME",nullable = false)
    private String name;
    @Column(name="PhoneNumber",nullable = false,unique = true)
    private String phone;

    @Column(name="EMAIL",nullable = false,unique = true)
    private String email;

    @Column(name = "PASSWORD",nullable = false)
    private String password;
    @Column(name = "ConfirmPassword",nullable = false)
    private String confirmPassword;

    public Registration() {
    }

    public Registration(long id, String username,String email, String phone, String password, String confirmpassword) {
        this.id = id;
        this.name = name;
        this.email=email;
        this.phone = phone;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
