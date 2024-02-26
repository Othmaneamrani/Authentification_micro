package com.micro.event.authentification.security;


import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.micro.event.authentification.model.User;
import com.micro.event.authentification.repository.IUserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomUserDetailsService implements UserDetailsService{

	private IUserRepository iUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = iUserRepository.findByUsername(username);
		if(user == null) {
			throw  new UsernameNotFoundException("Utilisateur non trouvé avec le nom d'utilisateur: " + username);
		}else {
			return org.springframework.security.core.userdetails.User.builder()
					.username(user.getUsername())
					.password(user.getPassword())
					.roles(user.getRoles().stream().map(r -> r.getNom()).toArray(String[]::new))
					.build();
		}
	}

}
