package com.infosys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Family;
import com.infosys.services.FamilyService;

@RestController
public class FamilyController {

	 @Autowired
	 FamilyService service;
	 
	 @PostMapping("/family")
	 public Family addFamilyInfo(@RequestBody Family registration) {
		 return service.addFamilyInfo(registration);
	 }
	 
	@PutMapping("/family/{id}")
	public Family updateFamilyInfo(@PathVariable("id") int id ,@RequestBody Family update) {
		  return service.updateFamilyInfoById(id,update);
	 }
}
