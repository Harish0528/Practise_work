package com.bitlabs.Facebook.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bitlabs.Facebook.Entity.User;
import com.bitlabs.Facebook.Service.UserServiceInterface;

@RestController
public class UserController {
	
	@Autowired
	UserServiceInterface usi;

	@PostMapping("/Registration")
	public String SaveUser(@RequestBody User user) {
		
		return usi.saveUser(user);
		
		
		
	}
	
}
