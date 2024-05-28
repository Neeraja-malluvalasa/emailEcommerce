package com.Ecommerce.emailEcommerce.Repository;
import com.Ecommerce.emailEcommerce.Model.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo  extends JpaRepository<Registration,Integer> {

    Registration findByEmail(String email);

}