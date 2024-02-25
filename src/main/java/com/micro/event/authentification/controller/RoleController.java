package com.micro.event.authentification.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.micro.event.authentification.command.RoleCommand;
import com.micro.event.authentification.service.IRoleService;

import lombok.AllArgsConstructor;


@RestController
@RequestMapping("/api/role")
@AllArgsConstructor
public class RoleController {

	private IRoleService iRoleService;
	
	
	@PostMapping("/addRole/{idUser}")
	public void addRoleToUser (@RequestBody  RoleCommand roleCommand ,@PathVariable int idUser) {
		iRoleService.addRoleToUser(roleCommand, idUser);
	}
	
	
	@DeleteMapping("/removeRole/{idUser}")
	public void removeRoleToUser (@RequestBody RoleCommand roleCommand ,@PathVariable int idUser) {
		iRoleService.removeRoleToUser(roleCommand, idUser);
	}
	
}
