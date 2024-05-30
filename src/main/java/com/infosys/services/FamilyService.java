package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Family;
import com.infosys.entities.User;
import com.infosys.repositories.FamilyRepository;

@Service
public class FamilyService implements FamilyServiceInterface {

	@Autowired
	FamilyRepository repository;
	
	@Override
	public Family addFamilyInfo(Family registration) {
		return repository.save(registration);
	}
	@Override
	public Family updateFamilyInfoById(int id , Family update) {
		Family e = repository.findById(id).get();
		e.setFamilyinfoId(update.getFamilyinfoId());
		e.setFamilyStatus(update.getFamilyStatus());
		e.setFamilyType(update.getFamilyType());
		e.setFatherName(update.getFatherName());
		e.setRid(update.getRid());
		
        return repository.save(e);
	}
	
	public Family getUserByid(int id) {
		return repository.findById(id).get();
	}
	public Family getUserByRid(int rid) {
        return repository.findByRid(rid);
    }
	
	public void deleteUserByRid(int rid) {
		Family user = repository.findByRid(rid);
		if(user !=null) {
			repository.delete(user);
		}
		else {
			throw new RuntimeException("User with RID:"+rid+" not fount");
		}
	}
	
}
