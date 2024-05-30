package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Education;
import com.infosys.entities.User;
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
		Education e = repository.findById(id).get();
		e.setEducationFiled(update.getEducationFiled());
		e.setEducationId(update.getEducationId());
		e.setEducationLevel(update.getEducationLevel());
		e.setRid(update.getRid());
		return repository.save(e);
        
	}
	
	public Education getUserByid(int id) {
		return repository.findById(id).get();
	}
	
	public Education getUserByRid(int rid) {
        return repository.findByRid(rid);
    }
	
	public void deleteUserByRid(int rid) {
		Education user = repository.findByRid(rid);
		if(user !=null) {
			repository.delete(user);
		}
		else {
			throw new RuntimeException("User with RID:"+rid+" not fount");
		}
	}
}
