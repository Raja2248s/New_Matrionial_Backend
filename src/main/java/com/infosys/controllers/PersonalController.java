package com.infosys.controllers;

import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Personal;
import com.infosys.services.PersonalService;


@RestController
public class PersonalController {

	@Autowired
	PersonalService service;
	
	@PostMapping("/personal")
	   public Personal addPersonalInfo(@RequestBody Personal personal) {
		   byte[] photographBytes = Base64.getDecoder().decode(personal.getPhotograph());
		   personal.setPhotograph(photographBytes);
		   return service.addPersonalInfo(personal);
	   }
	@PutMapping("/personal/{id}")
	   public Personal updatePersonalInfo(@PathVariable("id") int id ,@RequestBody Personal update) {
		byte[] photographBytes = Base64.getDecoder().decode(update.getPhotograph());
          update.setPhotograph(photographBytes);
		   return service.updatePersonalInfoById(id ,  update);
	   }
}
