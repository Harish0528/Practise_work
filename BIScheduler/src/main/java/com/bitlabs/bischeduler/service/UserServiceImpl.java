package com.bitlabs.bischeduler.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bitlabs.bischeduler.entity.Password;
import com.bitlabs.bischeduler.entity.Users;
import com.bitlabs.bischeduler.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService { // UserDetailsService pre-define interface
	@Autowired
    private UserRepository userrepository;
	
	PasswordEncoder passwordEncoder=new BCryptPasswordEncoder();
	
	@Override
	public String saveUser(Users user) {
        String str="";
         List<Users> users=userrepository.findAll();
         for(Users u:users) {
        	 if(u.getUsername().equals(user.getUsername())) {
        		str="username is already in use"; 
        		break;
        	 }
        	 else {
        		 str="Register Sucess";
        	 }
         }
         if(str.equals("Register Sucess")) {
        	// String usern=user.getUsername().toLowerCase();
        	 String pwd=passwordEncoder.encode(user.getPassword());
        	 //user.setUsername(usern);
        	 user.setPassword(pwd);
        	 userrepository.save(user);
         }
         return str;
	}
	
	@Override
	public boolean login(Users user) {
		boolean b=false;
		
		List<Users> users=userrepository.findAll();
		for(Users u:users) {
			
			if(u.getUsername().equals(user.getUsername()) && passwordEncoder.matches(user.getPassword(),u.getPassword() ) ){
				
				b=true;
			}
		}
		return b;
	}
	
	  
	  
	@Override
	public List<Users> getUsersByUsername(String username) {
		// TODO Auto-generated method stub
		return userrepository.findUsersByUsername(username);
	}
	
	
	
	
	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepository.findAll();
	}
	
	@Override
	public String updateUserById(int id, Users user) {
		// TODO Auto-generated method stub
		Users us=userrepository.findById(id).get();
		user.setCreated_at(us.getCreated_at());
		Users u=userrepository.save(user);
		if(u!=null) {
			return "Update Sucessfull";
		}
		else {
			return "update failed";
		}
	}

	@Override
	public String updatePaswword(Password pwd) {
		
//		String p=pwd.getOldpwd();
		Users u=userrepository.findUserByUsername(pwd.getUsername());
		
		if(u.getPassword().equals(pwd.getOldpwd())) {
			u.setPassword(pwd.getCfmpwd());
			userrepository.save(u);
			return "password update sucessfully";
		}
		else {
			return "old password is incorrect";
		}
		
	}

	@Override
	public void deleteUserById(int id) {
		// TODO Auto-generated method stub
		userrepository.deleteById(id);
	}

	
	

}
