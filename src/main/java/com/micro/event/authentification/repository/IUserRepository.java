package com.micro.event.authentification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.event.authentification.model.User;

public interface IUserRepository extends JpaRepository<User, Integer> {

	User findByUsername(String username);
	
}
