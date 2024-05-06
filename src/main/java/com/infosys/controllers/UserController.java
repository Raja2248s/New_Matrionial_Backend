package com.infosys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.services.RegistrationService;
import com.infosys.services.UserService;

import java.util.List;


@RestController
public class UserController {
    @Autowired
	UserService service ;
    
    @Autowired
    RegistrationService registrationService;
    @GetMapping("/user")
    public List<User> getAllUser(){
    	return service.getAllUser();
    }
    
    
    @PostMapping("/user")
    public User addUser(@RequestBody User user) {
    	 Registration registration = user.getRegistration(); // Get registration from user
         registrationService.addRegistration(registration);
         user.setRegistration(registration);
    	return service.addUser(user);
    }
    
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") int id) {
    	return service.getUserById(id);
    }
    
    
}
