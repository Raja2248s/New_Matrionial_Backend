package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Education;
import com.infosys.repositories.EducationRepository;

@Service
public class EducationService implements EducationServiceInterface {
	
	@Autowired
	EducationRepository repository;
	
	@Override
	public Education addEducationCareer(Education registration) {
		return repository.save(registration);
	}
	@Override
	public Education updateEducationCareerById(int id , Education update) {
		Education existingEducationCareer = repository.findById(id).get();
		
		return repository.save(existingEducationCareer);
        
	}
}
