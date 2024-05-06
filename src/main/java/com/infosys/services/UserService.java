package com.infosys.services;

import org.springframework.stereotype.Service;

import com.infosys.entities.User;
import com.infosys.repositories.UserRepositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UserService implements UserServiceInterface {
 
	@Autowired
	UserRepositories repository;
	@Override
	public List<User> getAllUser(){
		return repository.findAll();
	}
	
	@Override
	public User addUser(User user) {
		return repository.save(user);
	}
	
	@Override 
	public User getUserById(int id) {
		return repository.findById(id).get();
	}
}
