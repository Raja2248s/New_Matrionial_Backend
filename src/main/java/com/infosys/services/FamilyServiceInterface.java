package com.infosys.services;

import com.infosys.entities.Family;
import com.infosys.entities.Personal;

public interface FamilyServiceInterface {
	public Family addFamilyInfo(Family registration);
	public Family updateFamilyInfoById(int id , Family update);
	public void deleteUserByRid(int rid);
	public Family getUserByRid(int rid);
}
