package com.infosys.services;

import com.infosys.entities.Education;


public interface EducationServiceInterface {
	public Education addEducationCareer(Education registration);
	public Education updateEducationCareerById(int id , Education update);
}
