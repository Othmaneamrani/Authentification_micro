package com.micro.event.authentification.service;

import com.micro.event.authentification.command.RoleCommand;

public interface IRoleService {

	public void addRoleToUser (RoleCommand roleCommand , int idUser);
	
	public void removeRoleToUser (RoleCommand roleCommand , int idUser);
	
}
