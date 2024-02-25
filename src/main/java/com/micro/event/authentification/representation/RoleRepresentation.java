package com.micro.event.authentification.representation;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.micro.event.authentification.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleRepresentation {
	
	private int idRepresentation;
	
	private String nomRepresentation;
	
	@JsonIgnore
	private User userRepresentation;

}
