package com.infosys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity

public class Personal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int personalId;
	
	@OneToOne
	@JoinColumn(name="rid")
//	@PrimaryKeyJoinColumn
//	@JsonIgnore
	private Registration registration ;
	
	@Lob
	private byte[] photograph;
	
	private String bloodGroup;
	private Integer age;
	public int getPersonalId() {
		return personalId;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Personal(int personalId, Registration registration, byte[] photograph, String bloodGroup, Integer age) {
		super();
		this.personalId = personalId;
		this.registration = registration;
		this.photograph = photograph;
		this.bloodGroup = bloodGroup;
		this.age = age;
	}
	public Personal() {
		super();
	}
	public Personal(int personalId, Registration registration, byte[] photograph, String bloodGroup) {
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

	public byte[] getPhotograph() {
		return photograph;
	}

	public void setPhotograph(byte[] photograph) {
		this.photograph = photograph;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	

	
}
