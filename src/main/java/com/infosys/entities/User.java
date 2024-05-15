package com.infosys.entities;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userId;
	
	@OneToOne
	
	@PrimaryKeyJoinColumn
	
	private Registration registration ;
    private String firstName;
    private String lastName;
    private String address;
    
    private int noOfGuest;
    private String gender;
    private String dateofFunction;
    private String mobileNum;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public Registration getRegistration() {
		return registration;
	}
	public void setRegistration(Registration registration) {
		this.registration = registration;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNoOfGuest() {
		return noOfGuest;
	}
	public void setNoOfGuest(int noOfGuest) {
		this.noOfGuest = noOfGuest;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateofFunction() {
		return dateofFunction;
	}
	public void setDateofFunction(String dateofFunction) {
		this.dateofFunction = dateofFunction;
	}
	public String getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(String mobileNum) {
		this.mobileNum = mobileNum;
	}
	public User(int userId, Registration registration, String firstName, String lastName, String address, int noOfGuest,
			String gender, String dateofFunction, String mobileNum) {
		super();
		this.userId = userId;
		this.registration = registration;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.noOfGuest = noOfGuest;
		this.gender = gender;
		this.dateofFunction = dateofFunction;
		this.mobileNum = mobileNum;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
