package com.infosys.services;

import com.infosys.entities.Family;

public interface FamilyServiceInterface {
	public Family addFamilyInfo(Family registration);
	public Family updateFamilyInfoById(int id , Family update);
}
