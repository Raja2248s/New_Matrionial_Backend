package com.infosys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Education;
import com.infosys.entities.Family;
import com.infosys.entities.Registration;
import com.infosys.services.EducationService;
import com.infosys.services.RegistrationService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "*")
public class EducationController {
	@Autowired
	EducationService service;
	 
	@Autowired
	RegistrationService registrationService;
	
	
	 @PostMapping("/edu")
	 public Education addEducationCareer(@RequestBody Education education) {
		
		 return service.addEducationCareer(education);
	 }
	 
	@PutMapping("/edu/{id}")
	public Education updateEducationCareer(@PathVariable("id") int id ,@RequestBody Education update) {
		  return service.updateEducationCareerById(id,update);
	 }
	
	@GetMapping("/edu/rid/{rid}")
    public Education getUserByRid(@PathVariable("rid") int rid) {
        return service.getUserByRid(rid);
    }
	
	
	 @DeleteMapping("/edu/rd/{rid}")
	    public void deleteUserByRid(@PathVariable("rid") int rid) {
	    	service.deleteUserByRid(rid);
	    }
}
