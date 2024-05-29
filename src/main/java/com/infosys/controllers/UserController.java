package com.infosys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
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
@CrossOrigin(origins = "http://localhost:4200")
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
    	return service.addUser(user);
    }
    
    @GetMapping("/user/rid/{rid}")
    public User getUserByRid(@PathVariable("rid") int rid) {
        return service.getUserByRid(rid);
    }
    
    
    
    @DeleteMapping("/user/rd/{rid}")
    public void deleteUserByRid(@PathVariable("rid") int rid) {
    	service.deleteUserByRid(rid);
    }
    
    
}
