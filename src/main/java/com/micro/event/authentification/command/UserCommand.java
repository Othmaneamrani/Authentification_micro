package com.micro.event.authentification.command;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserCommand {
	
	private int idCommand ;
	
	private String usernameCommand;
	
	private String passwordCommand;
	
	private String emailCommand;

	private List<RoleCommand> rolesCommand;

}
