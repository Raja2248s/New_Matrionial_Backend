package com.infosys.services;

import java.io.IOException;

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
	public Personal updatePersonalInfoById(int id , Personal update) {
		Personal existingRegistration = repository.findById(id).get();
        existingRegistration.setPhotograph(update.getPhotograph());
        existingRegistration.setBloodGroup(update.getBloodGroup());
        existingRegistration.setAge(update.getAge());
        return repository.save(existingRegistration);
	}

	@Override
	public Personal savePersonalInfo(Personal personalInfo) {
		 throw new UnsupportedOperationException("Unimplemented method 'savePersonalInfo'");
	
	}
	
	public Personal getUserByRid(int rid) {
        return repository.findByRid(rid);
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
