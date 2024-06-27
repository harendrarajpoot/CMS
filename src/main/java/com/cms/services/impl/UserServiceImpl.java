package com.cms.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cms.dto.UserDto;
import com.cms.entities.Role;
import com.cms.entities.User;
import com.cms.repository.RoleRepository;
import com.cms.repository.UserRepository;
import com.cms.services.UserServices;

@Service
public class UserServiceImpl implements UserServices{

	private UserRepository userRepository;
	private RoleRepository roleRepository;
	private PasswordEncoder passwordEncoder;
	
	
	public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository,
			PasswordEncoder passwordEncoder) {
		this.userRepository = userRepository;
		this.roleRepository = roleRepository;
		this.passwordEncoder = passwordEncoder;
	}

	@Override
	public User findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User saveUser(UserDto userdto) {
		List<Role>roles=new ArrayList<Role>();
		User user=new User();
		user.setFname(userdto.getFname());
		user.setLname(userdto.getLname());
		user.setPassword(passwordEncoder.encode(userdto.getPassword()));
		user.setEmail(userdto.getEmail());
		
		Role role =roleRepository.findByName("USER");
		System.out.println("Role---"+role);
		if(role==null)
		{
			role=createRole();	
		}
		
		user.setRoles(roles);
		
		return userRepository.save(user);
	}

	private Role createRole() {
		System.out.println("create user");
		Role role=new Role();
		role.setName("USER");
		return role;
	}

}