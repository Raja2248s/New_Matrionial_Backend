package com.infosys.services;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.infosys.entities.Personal;
import com.infosys.entities.Registration;
import com.infosys.entities.User;
import com.infosys.repositories.PersonalRepository;

@Service
public class PersonalService implements PersonalServiceInterface {
	
	@Autowired
	PersonalRepository repository;
	
	@Override
	public Personal addPersonalInfo(MultipartFile file , String bloodGroup , int rid , int age) throws IOException {
//		Registration reg = user.getRegistration();
		
//		user.setRegistration(reg);
		Personal user= new Personal();
		user.setBloodGroup(bloodGroup);
		user.setAge(age);
		user.setRid(rid);
		if(file !=null && !file.isEmpty()) {
			user.setPhotograph(file.getBytes());
			
		}
		return repository.save(user);
	}
	
	@Override
	public List<Personal> getAllPersonalUsers(){
		
		return repository.findAll();
	}
	
	@Override
	public Personal updatePersonalInfoById(MultipartFile file , String bloodGroup , int age , int id) throws IOException {
		Personal e = repository.findById(id).get();
        e.setBloodGroup(bloodGroup);
        e.setAge(age);
        e.setRid(e.getRid());
        e.setPersonalId(e.getPersonalId());
        if(file!=null && !file.isEmpty()) {
        	e.setPhotograph(file.getBytes());
        }
        return repository.save(e);
		
	}
	

	@Override
	public Personal savePersonalInfo(Personal personalInfo) {
		 throw new UnsupportedOperationException("Unimplemented method 'savePersonalInfo'");
	
	}
	
	public Personal getUserByRid(int rid) {
        return repository.findByRid(rid);
    }
	
	public Personal getUserByid(int id) {
		return repository.findById(id).get();
	}
	
	public void deleteUserByRid(int rid) {
		Personal user = repository.findByRid(rid);
		if(user !=null) {
			repository.delete(user);
		}
		else {
			throw new RuntimeException("User with RID:"+rid+" not fount");
		}
	}

	
}
