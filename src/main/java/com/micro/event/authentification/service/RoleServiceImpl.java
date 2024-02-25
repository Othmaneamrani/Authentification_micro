package com.micro.event.authentification.service;

import org.springframework.stereotype.Service;

import com.micro.event.authentification.command.RoleCommand;
import com.micro.event.authentification.mapper.IRoleMapper;
import com.micro.event.authentification.model.Role;
import com.micro.event.authentification.model.User;
import com.micro.event.authentification.repository.IRoleRepository;
import com.micro.event.authentification.repository.IUserRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class RoleServiceImpl implements IRoleService {
	
	private IRoleRepository iRoleRepository;
	private IUserRepository iUserRepository;
	private IRoleMapper iRoleMapper;

	@Override
	public void addRoleToUser(RoleCommand roleCommand, int idUser) {
		User user = iUserRepository.findById(idUser).get();
		Role role = iRoleMapper.convertCommandToEntity(roleCommand);
		role.setUser(user);
		iRoleRepository.save(role);
		user.getRoles().add(role);
		iUserRepository.save(user);
	}

	@Override
	public void removeRoleToUser(RoleCommand roleCommand, int idUser) {
		User user = iUserRepository.findById(idUser).get();
		Role role = iRoleMapper.convertCommandToEntity(roleCommand);
		for(Role roleDelete : user.getRoles()) {
			if(roleDelete.getId() == role.getId()) {
				user.getRoles().remove(roleDelete);
				break;
			}
		}
		iRoleRepository.delete(role);
		iUserRepository.save(user);
	}

	
	
}
