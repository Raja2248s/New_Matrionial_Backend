package com.infosys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Education;
import com.infosys.entities.Family;
import com.infosys.entities.Personal;
import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.repositories.RegistrationRepositories;

@Service
public class RegistrationService implements RegistrationServiceInterface {

	@Autowired
	RegistrationRepositories repository;
	
//	@Autowired
//	UserService userService;
	
	
	@Override
	public List<Registration> getAllRegistration(){
		
		return repository.findAll();
	}
	
	@Override
	public Registration addRegistration(Registration user) {
//		 User user1  =   user.getUser();
//		  userervice.addUser(user1);
//		  user.setUser(user1);
//		  //Family
//		  Family family = user.getFamily();
//		  familyService.addFamilyInfo(family);
//		  user.setFamily(family);
//		  //Personal
//		  Personal personal = user.getPersonal();
//		  personalService.addPersonalInfo(personal);
//		  user.setPersonal(personal);
//		  //Education
//		  Education education = user.getEducation();
//		  educationService.addEducationCareer(education);
//		  user.setEducation(education);
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
