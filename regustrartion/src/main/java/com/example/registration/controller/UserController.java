package com.example.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.Users;
import com.example.registration.service.UserServiceInterface;

@RestController
@CrossOrigin
public class UserController {
	
	@Autowired
	private UserServiceInterface usi;
	
	@PostMapping("/userResgistration")
	public String userRegistration(@RequestBody Users user) {
		return usi.saveUser(user);
		
	}

}
