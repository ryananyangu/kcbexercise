package com.interview.kcb.application.models;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue
    private int id; 

    
    private String lastName;

    private String firstName;

    private String username;

    private String email;

    private String phonenumber;

    private String password;

    @ElementCollection(fetch = FetchType.EAGER)
    List<Role> roles;
}
