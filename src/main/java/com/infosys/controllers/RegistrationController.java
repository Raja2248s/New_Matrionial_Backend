package com.infosys.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.services.RegistrationService;
import com.infosys.services.UserService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
	
   @Autowired
   RegistrationService service;
   
   @Autowired
   UserService userservice;
   
   @GetMapping("/reg")
   public List<Registration> getAllRegistration(){
	   return service.getAllRegistration();
   }
   
   @PostMapping("/reg")
   public Registration addRegistration(@RequestBody Registration user) {
	  User user1  =   user.getUser();
	  userservice.addUser(user1);
	  user.setUser(user1);
	   return service.addRegistration(user);
   }
   
   @GetMapping("/reg/{email}")
   public Registration getRegistrationInfoByEmail(@PathVariable("email") String email) {
	   return service.getRegistrationInfoByEmail(email);
   }
   
   @PutMapping("/reg/{id}")
   public Registration updateRegistration(@PathVariable("id") int id ,@RequestBody Registration update) {
	   return service.updateRegistrationById(id ,  update);
   }
   
   @DeleteMapping("/reg/{id}")
  public void deleteRegistration(@PathVariable("id") int id) {
	  service.deleteRegistration(id);
  }
   
}
