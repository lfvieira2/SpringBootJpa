package com.spring.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.web.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
