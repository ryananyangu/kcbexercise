package com.interview.kcb.application.repositories;

import com.interview.kcb.application.models.User;

import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepo  extends JpaRepository<User, Integer>  {

  boolean existsByUsername(String username);

  User findByUsername(String username);


}
