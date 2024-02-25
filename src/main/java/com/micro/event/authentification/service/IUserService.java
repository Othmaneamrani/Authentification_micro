package com.micro.event.authentification.service;

import java.util.List;

import com.micro.event.authentification.command.UserCommand;
import com.micro.event.authentification.representation.UserRepresentation;

public interface IUserService {
	
	public List<UserRepresentation> getAllUsers();

	public UserRepresentation createUser(UserCommand userCommand);
	
	public UserRepresentation updateUser(UserCommand userCommand);
	
	public void deleteUser(int id);
	
}
