package com.micro.event.authentification.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.micro.event.authentification.command.UserCommand;
import com.micro.event.authentification.model.User;
import com.micro.event.authentification.representation.UserRepresentation;

@Mapper(componentModel = "spring" , uses = IRoleMapper.class)
public interface IUserMapper {

	@Mappings({
		@Mapping(source = "idCommand" , target = "id"),
		@Mapping(source = "usernameCommand" , target = "username"),
		@Mapping(source = "passwordCommand" , target = "password"),
		@Mapping(source = "emailCommand" , target = "email"),
		@Mapping(source = "rolesCommand" , target = "roles")
	})
	public User convertCommandToEntity(UserCommand userCommand);	
	
	
	@Mappings({
		@Mapping(source = "id" , target = "idRepresentation"),
		@Mapping(source = "username" , target = "usernameRepresentation"),
		@Mapping(source = "password" , target = "passwordRepresentation"),
		@Mapping(source = "email" , target = "emailRepresentation"),
		@Mapping(source = "roles" , target = "rolesRepresentation")
	})
	public UserRepresentation convertEntityToRepresentation(User user);

	
	
	@Mappings({
		@Mapping(source = "id" , target = "idRepresentation"),
		@Mapping(source = "username" , target = "usernameRepresentation"),
		@Mapping(source = "password" , target = "passwordRepresentation"),
		@Mapping(source = "email" , target = "emailRepresentation"),
		@Mapping(source = "roles" , target = "rolesRepresentation")
	})
	public List<UserRepresentation> convertListEntityToListRepresentation(List<User> users);
	
}
