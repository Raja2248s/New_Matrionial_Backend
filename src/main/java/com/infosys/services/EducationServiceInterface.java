package com.infosys.services;

import com.infosys.entities.Education;
import com.infosys.entities.Personal;


public interface EducationServiceInterface {
	public Education addEducationCareer(Education registration);
	public Education updateEducationCareerById(int id , Education update);
	public void deleteUserByRid(int rid);
	public Education getUserByRid(int rid);
}
