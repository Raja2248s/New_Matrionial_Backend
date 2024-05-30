package com.infosys.services;

import org.springframework.stereotype.Service;

import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.repositories.UserRepositories;

import java.util.List;
import java.util.Map;

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
	
	public User getUserByRid(int rid) {
        return repository.findByRid(rid);
    }
	 
	public User updateUserInfoById(int id , User user) {
		
		User e = repository.findById(id).get();
		e.setUserId(e.getUserId());
		e.setFirstName(user.getFirstName());
		e.setLastName(user.getLastName());
		e.setGender(user.getGender());
		e.setAddress(user.getAddress());
		e.setDateofFunction(user.getDateofFunction());
		e.setNoOfGuest(user.getNoOfGuest());
		e.setRid(e.getRid());
		e.setMobileNum(user.getMobileNum());
		
		
		return repository.save(e);
	}
	
	
	public User patchUserInfoById(int id, Map<String, Object> updates) {
        User user = repository.findById(id).orElseThrow(() -> new RuntimeException("User not found with id: " + id));

        updates.forEach((key, value) -> {
            switch (key) {
                case "firstName":
                    user.setFirstName((String) value);
                    break;
                case "lastName":
                    user.setLastName((String) value);
                    break;
                case "gender":
                    user.setGender((String) value);
                    break;
                case "address":
                    user.setAddress((String) value);
                    break;
                case "dateofFunction":
                    user.setDateofFunction((String) value);
                    break;
                case "noOfGuest":
                    user.setNoOfGuest((Integer) value);
                    break;
                case "rid":
                    user.setRid((Integer) value);
                    break;
                case "mobileNum":
                    user.setMobileNum((String) value);
                    break;
            }
        });

        return repository.save(user);
    }
	
	public void deleteUserByRid(int rid) {
		User user = repository.findByRid(rid);
		if(user !=null) {
			repository.delete(user);
		}
		else {
			throw new RuntimeException("User with RID:"+rid+" not fount");
		}
	}
}
