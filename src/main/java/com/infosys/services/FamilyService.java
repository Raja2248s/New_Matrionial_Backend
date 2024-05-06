package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entities.Family;
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
		Family existingFamilyInfo = repository.findById(id).get();
		existingFamilyInfo.setFamilyStatus(update.getFamilyStatus());
		existingFamilyInfo.setFamilyType(update.getFamilyType());
		existingFamilyInfo.setFatherName(update.getFatherName());
		existingFamilyInfo.setRegistration(update.getRegistration());
        return repository.save(existingFamilyInfo);
	}
	
}
