package com.infosys.services;

import java.util.List;

import com.infosys.entities.User;

public interface UserServiceInterface {

	public List<User> getAllUser();	
	public User addUser(User user);
	public User getUserById(int id);
	public void deleteUserByRid(int rid);
	public User getUserByRid(int rid);
}
