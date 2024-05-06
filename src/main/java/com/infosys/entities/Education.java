package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int educationId;
	
	@OneToOne
	@JoinColumn(name="rid")
	private Registration registration ;
	
	private String educationLevel;
	private String educationFiled;
	public int getEducationId() {
		return educationId;
	}
	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public String getEducationLevel() {
		return educationLevel;
	}
	public void setEducationLevel(String educationLevel) {
		this.educationLevel = educationLevel;
	}
	public String getEducationFiled() {
		return educationFiled;
	}
	public void setEducationFiled(String educationFiled) {
		this.educationFiled = educationFiled;
	}
	public Education(int educationId, Registration registration, String educationLevel, String educationFiled) {
		super();
		this.educationId = educationId;
		this.registration = registration;
		this.educationLevel = educationLevel;
		this.educationFiled = educationFiled;
	}
	
	
}
