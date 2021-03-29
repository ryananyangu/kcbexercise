package com.interview.kcb.application.repositories;

import java.util.List;

import com.interview.kcb.application.models.Customer;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Integer>{
    


    List<Customer> getCustomerIdentification(String identification);
}
