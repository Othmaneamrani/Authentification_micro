package com.micro.event.authentification.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.micro.event.authentification.command.RoleCommand;
import com.micro.event.authentification.model.Role;
import com.micro.event.authentification.representation.RoleRepresentation;

@Mapper(componentModel = "spring" , uses = IUserMapper.class)
public interface IRoleMapper {

	
	
	@Mappings({
		@Mapping(source = "idCommand" , target = "id" ),
		@Mapping(source = "nomCommand" , target = "nom" ),
		@Mapping(source = "userCommand" , target = "user" )
	})
	public Role convertCommandToEntity (RoleCommand roleCommand);
	
	
	@Mappings({
		@Mapping(source = "id" , target = "idRepresentation" ),
		@Mapping(source = "nom" , target = "nomRepresentation" ),
		@Mapping(source = "user" , target = "userRepresentation" )
	})
	public RoleRepresentation convertEntityToRepresentation (Role role);
	
}
