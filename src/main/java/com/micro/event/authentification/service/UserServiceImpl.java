package com.micro.event.authentification.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.micro.event.authentification.command.UserCommand;
import com.micro.event.authentification.mapper.IUserMapper;
import com.micro.event.authentification.model.User;
import com.micro.event.authentification.repository.IUserRepository;
import com.micro.event.authentification.representation.UserRepresentation;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
@Transactional
public class UserServiceImpl implements IUserService {
	
	private IUserRepository iUserRepository;
	private IUserMapper iUserMapper;

	@Override
	public List<UserRepresentation> getAllUsers() {
		List<UserRepresentation> users = iUserMapper.convertListEntityToListRepresentation(iUserRepository.findAll());
		return users;
	}

	@Override
	public UserRepresentation createUser(UserCommand userCommand) {
		User user = iUserMapper.convertCommandToEntity(userCommand);
		iUserRepository.save(user);
		return iUserMapper.convertEntityToRepresentation(user);
	}

	@Override
	public UserRepresentation updateUser(UserCommand userCommand) {
		User user = iUserMapper.convertCommandToEntity(userCommand);
		iUserRepository.save(user);
		return iUserMapper.convertEntityToRepresentation(user);
	}

	@Override
	public void deleteUser(int id) {
		iUserRepository.deleteById(id);
	}

	
	
}
