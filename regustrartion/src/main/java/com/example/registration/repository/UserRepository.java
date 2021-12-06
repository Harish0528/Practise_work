package com.example.registration.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.registration.entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Integer> {
	

}
