package com.infosys.services;

import java.io.IOException;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.infosys.entities.Personal;
import com.infosys.entities.Registration;
import com.infosys.entities.User;

public interface PersonalServiceInterface {
	public Personal savePersonalInfo(Personal personalInfo);
	public Personal addPersonalInfo(MultipartFile file , String bloodGroup  , int rid, int age) throws IOException;
//	public Personal updatePersonalInfoById(int id , Personal update);
	public void deleteUserByRid(int rid);
	public Personal getUserByRid(int rid);
	public Personal getUserByid(int id);
	public Personal updatePersonalInfoById(MultipartFile file , String bloodGroup , int id , int age )throws IOException;
	List<Personal> getAllPersonalUsers();
	
}
