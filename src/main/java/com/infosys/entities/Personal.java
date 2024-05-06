package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Personal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personalId;
	
	@OneToOne
	@JoinColumn(name="rid")
	private Registration registration ;
	
	private String photograph;
	
	public int getPersonalId() {
		return personalId;
	}
	public Personal() {
		super();
	}
	public Personal(int personalId, Registration registration, String photograph, String bloodGroup) {
		super();
		this.personalId = personalId;
		this.registration = registration;
		this.photograph = photograph;
		this.bloodGroup = bloodGroup;
	}

	public void setPersonalId(int personalId) {
		this.personalId = personalId;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public String getPhotograph() {
		return photograph;
	}

	public void setPhotograph(String photograph) {
		this.photograph = photograph;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	private String bloodGroup;

	
}
