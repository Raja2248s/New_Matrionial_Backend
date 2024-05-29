package com.infosys.controllers;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.infosys.entities.Personal;
import com.infosys.entities.Registration;
import com.infosys.services.PersonalService;
import com.infosys.services.RegistrationService;


@RestController
@CrossOrigin(origins = "*")
public class PersonalController {

	@Autowired
	PersonalService service;
	
	@Autowired
	RegistrationService registrationService;
	
	
	
	
	@PostMapping(value="/personal" , consumes= {"multipart/form-data"})
//	public Personal addPersonalInfo(@RequestBody Personal personal) {
////		byte[] photographbytes = Base64.getDecoder().decode(personal.getPhotograph());
////		personal.setPhotograph(photographbytes);
//		
//		return service.addPersonalInfo(personal);
//	}
	public ResponseEntity<?> addPersonalInfo(@RequestParam("file") MultipartFile file , @RequestParam("bloodGroup") String bloodGroup ,  
			@RequestParam("age") String age , @RequestParam("rid") String rid) {
//		byte[] photographbytes = Base64.getDecoder().decode(personal.getPhotograph());
//		personal.setPhotograph(photographbytes);
		try {
			int ridInt = Integer.parseInt(rid);
			int ageInt = Integer.parseInt(age);
			Personal personalInfo = service.addPersonalInfo(file , bloodGroup , ridInt , ageInt);
			return new ResponseEntity<>(personalInfo , HttpStatus.CREATED);
		}
		catch(Exception e) {
			return new ResponseEntity<>("Failed to upload file: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
//		return service.addPersonalInfo(personal);
	}
//	   public Personal addPersonalInfo(@RequestBody Personal personal) {
//		   byte[] photographBytes = Base64.getDecoder().decode(personal.getPhotograph());
//		   personal.setPhotograph(photographBytes);
//		 if (personal.getPhotograph() != null) {
//		        byte[] photographBytes = Base64.getDecoder().decode(personal.getPhotograph());
//		        personal.setPhotograph(photographBytes);
//		    }
////		 Personal personal1 = new Personal();
////		 Registration registration = personal.getRegistration();
////		 personal1.setAge(personal.getAge());
////		 personal1.setBloodGroup(personal.getBloodGroup());
////		 personal1.setPhotograph(personal.getPhotograph());
////		 personal1.setRegistration(personal.getRegistration());
////		 Registration registration = personal.getRegistration(); // Get registration from user
////         registrationService.addRegistration(registration);
////         personal.setRegistration(registration);
////		 personal.setRegistration(registration);
//		   return service.addPersonalInfo(personal);
//	   }
	
//	@PostMapping("/personal")
////@PostMapping("/personal")
//	public Personal addPersonalInfo(@RequestBody Personal personal) {
//	    // Check if the Registration object is not null and already persisted
//	    if (personal.getRegistration() == null || personal.getRegistration().getRid() <= 0) {
//	        // The Registration object is either null or not persisted yet
//	        personal.setRegistration(null); // Detach the transient Registration object
//	    }
//
//	    // Handle photograph decoding if needed
//	    if (personal.getPhotograph() != null) {
//	        byte[] photographBytes = Base64.getDecoder().decode(personal.getPhotograph());
//	        personal.setPhotograph(photographBytes);
//	    }
//    
//	    // Now persist Personal entity
//	    return service.addPersonalInfo(personal);
//	}


	@PutMapping("/personal/{id}")
	   public Personal updatePersonalInfo(@PathVariable("id") int id ,@RequestBody Personal update) {
//		byte[] photographBytes = Base64.getDecoder().decode(update.getPhotograph());
//          update.setPhotograph(photographBytes);
		   return service.updatePersonalInfoById(id ,  update);
	   }
	
	@GetMapping("/personal/rid/{rid}")
    public Personal getUserByRid(@PathVariable("rid") int rid) {
        return service.getUserByRid(rid);
    }
	
	@DeleteMapping("/personal/rd/{rid}")
    public void deleteUserByRid(@PathVariable("rid") int rid) {
    	service.deleteUserByRid(rid);
    }
}
