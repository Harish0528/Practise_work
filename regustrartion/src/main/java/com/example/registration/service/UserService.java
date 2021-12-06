package com.example.registration.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.Users;
import com.example.registration.repository.UserRepository;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	private UserRepository ur;
	
	@Override
	public String saveUser(Users user) {
		
		Users u=ur.save(user);
		String str="registration not sucess";
		if(u!=null) {
			str="user register sucess";
		}
		return str;
		
	}

}
