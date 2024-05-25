package com.infosys.services;

import org.springframework.stereotype.Service;

import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.repositories.UserRepositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService implements UserServiceInterface {
 
	@Autowired
	UserRepositories repository;
	
	@Autowired
	RegistrationService registrationService ;
	
	@Override
	public List<User> getAllUser(){
		return repository.findAll();
	}
	
	@Override
	public User addUser(User user) {
//		Registration r = user.getRegistration();
//		user.setRegistration(r);
		
		return repository.save(user);
	}
	
	@Override 
	public User getUserById(int id) {
		return repository.findById(id).get();
	}
}
