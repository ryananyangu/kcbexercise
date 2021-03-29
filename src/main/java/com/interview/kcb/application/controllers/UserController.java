package com.interview.kcb.application.controllers;


import com.interview.kcb.application.dtos.UserDTO;
import com.interview.kcb.application.models.User;
import com.interview.kcb.application.services.UserService;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/user")
public class UserController {

  @Autowired
  private UserService userService;

  @Autowired
  private ModelMapper modelMapper;

    @PostMapping("/signin")
    public String login( @RequestParam String username,@RequestParam String password) {
  return userService.signin(username, password);
}


  @PostMapping("/signup")
  public String signup( @RequestBody UserDTO user) {
    return userService.signup(modelMapper.map(user, User.class));
  }

    
}
