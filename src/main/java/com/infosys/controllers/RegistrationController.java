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

import com.infosys.entities.Family;
import com.infosys.entities.Registration;
import com.infosys.entities.*;
import com.infosys.services.FamilyService;
import com.infosys.services.RegistrationService;
import com.infosys.services.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class RegistrationController {
	
   @Autowired
   RegistrationService service;
   
   @Autowired
   UserService userService;
   
   @Autowired
   FamilyService familyService;
   
   @Autowired
   PersonalService personalService;
   
   @Autowired
   EducationService educationService;
   
   
   @GetMapping("/reg")
   public List<Registration> getAllRegistration(){
	   return service.getAllRegistration();
   }
   
//   @GetMapping("/reg/{id}")
//   public Registration getAllRegistrationById(int id){
//	   return service.getRegistrationInfoById(id);
//   }
   
   @PostMapping("/reg")
   public Registration addRegistration(@RequestBody Registration user) {
	   System.out.println("Received registration data: " + user.toString());
	   //User
//	   Registration r = service.addRegistration(user);
//	  User user1  =   user.getUser();
//	  userservice.addUser(user1);
//	  user.setUser(user1);
//	  //Family
//	  Family family = user.getFamily();
//	  familyService.addFamilyInfo(family);
//	  user.setFamily(family);
//	  //Personal
//	  Personal personal = user.getPersonal();
//	  personalService.addPersonalInfo(personal);
//	  user.setPersonal(personal);
//	  //Education
//	  Education education = user.getEducation();
//	  educationService.addEducationCareer(education);
//	  user.setEducation(education);
	  
//	   return service.addRegistration(user);
	   
	  return service.addRegistration(user);
   }
   
   @GetMapping("/reg/{email}" )
   public Registration getRegistrationInfoByEmail(@PathVariable("email") String email) {
	     return service.getRegistrationInfoByEmail(email);
   }
   
   @PutMapping("/reg/{id}")
   public Registration updateRegistration(@PathVariable("id") int id ,@RequestBody Registration update) {
	   return service.updateRegistrationById(id ,  update);
   }
   
   @DeleteMapping("/reg/{id}")
  public void deleteRegistration(@PathVariable("id") int id) {
	  userService.deleteUserByRid(id);
	  personalService.deleteUserByRid(id);
	  familyService.deleteUserByRid(id);
	  educationService.deleteUserByRid(id);
	  
	  service.deleteRegistration(id);
  }
   
}
