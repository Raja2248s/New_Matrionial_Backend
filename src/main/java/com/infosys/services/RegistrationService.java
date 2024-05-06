package com.infosys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Registration;
import com.infosys.repositories.RegistrationRepositories;

@Service
public class RegistrationService implements RegistrationServiceInterface {

	@Autowired
	RegistrationRepositories repository;
	
	
	@Override
	public List<Registration> getAllRegistration(){
		
		return repository.findAll();
	}
	
	@Override
	public Registration addRegistration(Registration user) {
		return repository.save(user);
	}
	
	@Override
	public Registration getRegistrationInfoById(int id) {
		return repository.findById(id).get();
	}
  
	@Override
	public Registration getRegistrationInfoByEmail(String email) {
		return repository.findByEmail(email);
	}
	@Override
	public Registration updateRegistrationById(int id , Registration update) {
		Registration existingRegistration = repository.findById(id).get();
        existingRegistration.setUserName(update.getUserName());
        existingRegistration.setPassword(update.getPassword());
        existingRegistration.setEmail(update.getEmail());
        return repository.save(existingRegistration);
	}
	
	 @Override
	 public void deleteRegistration(int id) {
		  repository.deleteById(id);
	 }
	
}
