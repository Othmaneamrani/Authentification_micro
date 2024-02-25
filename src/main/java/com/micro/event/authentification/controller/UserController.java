package com.micro.event.authentification.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.event.authentification.command.UserCommand;
import com.micro.event.authentification.representation.UserRepresentation;
import com.micro.event.authentification.service.IUserService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/user")
@AllArgsConstructor
public class UserController {
	
	private IUserService iUserService;

	
	@GetMapping("/users")
	public List<UserRepresentation> getAllUsers(){
		return iUserService.getAllUsers();
	}
	
	
	@PostMapping("/create")
	public UserRepresentation createUser(@RequestBody  UserCommand userCommand) {
		return iUserService.createUser(userCommand);
	}
	
	
	@PutMapping("/update")
	public UserRepresentation updateUser(@RequestBody  UserCommand userCommand) {
		return iUserService.updateUser(userCommand);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteUser(@PathVariable int id) {
		iUserService.deleteUser(id);
	}
	
}
