package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Personal;
import com.infosys.repositories.PersonalRepository;

@Service
public class PersonalService implements PersonalServiceInterface {
	
	@Autowired
	PersonalRepository repository;
	
	@Override
	public Personal addPersonalInfo(Personal registration) {
		return repository.save(registration);
	}
	@Override
	public Personal updatePersonalInfoById(int id , Personal update) {
		Personal existingRegistration = repository.findById(id).get();
        existingRegistration.setPhotograph(update.getPhotograph());
        existingRegistration.setBloodGroup(update.getBloodGroup());
        existingRegistration.setAge(update.getAge());
        return repository.save(existingRegistration);
	}
}
