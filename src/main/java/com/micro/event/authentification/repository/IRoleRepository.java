package com.micro.event.authentification.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.micro.event.authentification.model.Role;

public interface IRoleRepository extends JpaRepository<Role, Integer> {

}
