package com.bitlabs.Facebook.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.Facebook.Entity.User;

@Repository
public interface UserRepositaryInterface extends JpaRepository<User, Integer> {
	
	

}
