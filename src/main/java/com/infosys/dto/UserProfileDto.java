package com.infosys.dto;

public class UserProfileDto {
     
	private String firstName;
    private String lastName;
    private String address;
    
    private int noOfGuest;
    private String gender;
    private String dateofFunction;
    private String mobileNum;
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
	public UserProfileDto(String firstName, String lastName, String address, int noOfGuest, String gender,
			String dateofFunction, String mobileNum) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.noOfGuest = noOfGuest;
		this.gender = gender;
		this.dateofFunction = dateofFunction;
		this.mobileNum = mobileNum;
	}
	public UserProfileDto() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
