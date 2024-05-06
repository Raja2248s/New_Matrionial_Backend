package com.infosys.services;

import com.infosys.entities.Personal;

public interface PersonalServiceInterface {
	public Personal addPersonalInfo(Personal registration);
	public Personal updatePersonalInfoById(int id , Personal update);
}
