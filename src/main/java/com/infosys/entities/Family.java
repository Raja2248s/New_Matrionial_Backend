package com.infosys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Family {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int familyinfoId;
	
//	@OneToOne
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="rid")
//	@PrimaryKeyJoinColumn
	@JsonIgnore
	private Registration registration ;
	
	private String familyStatus;
	private String familyType;
	private String fatherName;
	public Family() {
		super();
	}
	public Family(int familyinfoId, Registration registration, String familyStatus, String familyType,
			String fatherName) {
		super();
		this.familyinfoId = familyinfoId;
		this.registration = registration;
		this.familyStatus = familyStatus;
		this.familyType = familyType;
		this.fatherName = fatherName;
	}
	public int getFamilyinfoId() {
		return familyinfoId;
	}
	public void setFamilyinfoId(int familyinfoId) {
		this.familyinfoId = familyinfoId;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public String getFamilyStatus() {
		return familyStatus;
	}
	public void setFamilyStatus(String familyStatus) {
		this.familyStatus = familyStatus;
	}
	public String getFamilyType() {
		return familyType;
	}
	public void setFamilyType(String familyType) {
		this.familyType = familyType;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
}
