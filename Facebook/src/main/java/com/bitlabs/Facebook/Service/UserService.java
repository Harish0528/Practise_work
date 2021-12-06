package com.bitlabs.Facebook.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitlabs.Facebook.Entity.User;
import com.bitlabs.Facebook.Repositary.UserRepositaryInterface;

@Service
public class UserService implements UserServiceInterface {

	@Autowired
	UserRepositaryInterface uri;
	
	@Override
	public String saveUser(User user) {
		
		String str="Registration Failed";
		User u=uri.save(user);
		
		if(u!=null) {
			str="Registration Sucess";
		}
		return str;
	}

}
