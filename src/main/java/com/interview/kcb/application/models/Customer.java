package com.interview.kcb.application.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Customer {

    @Id
    @GeneratedValue
    private int id; 

    
    private String lastName;

    private String firstName;

    private String username;

    private String email;

    private String phonenumber;


    
}
