package com.micro.event.authentification.command;

import com.micro.event.authentification.model.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RoleCommand {

	private int idCommand;
	
	private String nomCommand;
	
	private User userCommand;
	
}
