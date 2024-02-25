package com.micro.event.authentification.representation;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRepresentation {

	private int idRepresentation ;
	
	private String usernameRepresentation;
	
	private String passwordRepresentation;
	
	private String emailRepresentation;

	private List<RoleRepresentation> rolesRepresentation;
	
}
