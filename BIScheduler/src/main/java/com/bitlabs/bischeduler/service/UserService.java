package com.bitlabs.bischeduler.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;

import com.bitlabs.bischeduler.entity.Password;
import com.bitlabs.bischeduler.entity.Users;

public interface UserService {

	String saveUser(Users users);

	boolean login(Users user);

	

	List<Users> getUsersByUsername(String username);

	List<Users> getAllUsers();

	String updateUserById(int id, Users user);

	


	void deleteUserById(int id);

	String updatePaswword(Password pwd);



}
