package com.infosys.controllers;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Family;
import com.infosys.entities.Personal;
import com.infosys.entities.Registration;
import com.infosys.services.FamilyService;
import com.infosys.services.RegistrationService;

@RestController
@CrossOrigin(origins = "*")
public class FamilyController {

	 @Autowired
	 FamilyService service;
	 
	 @Autowired
	 RegistrationService registrationService;
	 
	 
	 @PostMapping("/family")
	 public Family addFamilyInfo(@RequestBody Family family) {
		 Registration registration = family.getRegistration();
		 registrationService.addRegistration(registration);
		 family.setRegistration(registration);
		 return service.addFamilyInfo(family);
	 }
	 
//	 public Family addFamilyInfo(@RequestBody Family personal) {
//		    // Check if the Registration object is not null and already persisted
//		    if (personal.getRegistration() == null || personal.getRegistration().getRid() <= 0) {
//		        // The Registration object is either null or not persisted yet
//		        personal.setRegistration(null); // Detach the transient Registration object
//		    }
//
//		    // Handle photograph decoding if needed
//		    
//
//		    // Now persist Personal entity
//		    return service.addFamilyInfo(personal);
//		}
//	 
	@PutMapping("/family/{id}")
	public Family updateFamilyInfo(@PathVariable("id") int id ,@RequestBody Family update) {
		  return service.updateFamilyInfoById(id,update);
	 }
}
