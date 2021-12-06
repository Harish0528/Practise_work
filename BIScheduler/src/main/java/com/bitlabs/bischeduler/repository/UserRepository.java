package com.bitlabs.bischeduler.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bitlabs.bischeduler.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {

	 public Optional<Users> findByUsername(String username);
	 
	 public Users findUserByUsername(String username);
	 
	 public List<Users> findUsersByUsername(String Username);
	 
}
