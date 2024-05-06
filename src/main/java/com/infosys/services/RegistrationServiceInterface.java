package com.infosys.services;

import java.util.List;

import com.infosys.entities.Registration;

public interface RegistrationServiceInterface {

	public List<Registration> getAllRegistration();
	public Registration addRegistration(Registration user);
	public Registration getRegistrationInfoById(int id);
	public Registration updateRegistrationById(int id , Registration update);
	public Registration getRegistrationInfoByEmail(String email);
    public void  deleteRegistration(int id);
    
}
