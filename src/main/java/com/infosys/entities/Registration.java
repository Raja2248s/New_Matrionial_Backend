package com.infosys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Registration {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rid;
	
	private String userName;
	private String password;
	private String phoneno;
//	private String email;
	
//	@JsonIgnore
////	@OneToOne(mappedBy = "registration" , fetch = FetchType.EAGER , cascade = CascadeType.ALL)
//	private User user;
//	
//	@JsonIgnore
////	@OneToOne(mappedBy = "registration" , fetch = FetchType.EAGER)
//	private Personal personal;
//	
//	@JsonIgnore
////	@OneToOne(mappedBy = "registration" , fetch = FetchType.EAGER)
//	private Family family;
//	
//	@JsonIgnore
////	@OneToOne(mappedBy = "registration" , fetch = FetchType.EAGER)
//	private Education education;
	
	
	public Registration(int rid, String userName,
			String password, String phoneno, String email) {
		super();
		this.rid = rid;
		this.userName = userName;
		this.password = password;
		this.phoneno = phoneno;
		this.email = email;
	}
//	public Registration(int rid, String userName, String password, String phoneno, String email) {
//		super();
//		this.rid = rid;
////		this.user = user;
//		
//		this.userName = userName;
//		this.password = password;
//		this.phoneno = phoneno;
//		this.email = email;
//	}
	@Override
	public String toString() {
		return "Registration [rid=" + rid + ", userName=" + userName + ", password=" + password + ", phoneno=" + phoneno
				+ ", email=" + email + "]";
	}
//	public Personal getPersonal() {
//		return personal;
//	}
//	public void setPersonal(Personal personal) {
//		this.personal = personal;
//	}
//	public Family getFamily() {
//		return family;
//	}
//	public void setFamily(Family family) {
//		this.family = family;
//	}
//	public Education getEducation() {
//		return education;
//	}
//	public void setEducation(Education education) {
//		this.education = education;
//	}
//	
	
	
	
	public String getPhoneno() {
		return phoneno;
	}
	
//	public Registration(int rid ,  String userName , String password, String phoneno, String email) {
//		super();
//		this.rid = rid;
////		this.user = user;
//		this.userName = userName;
//		this.password = password;
//		this.phoneno = phoneno;
//		this.email = email;
//	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Column(unique = true)
	private String email;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int rid,  String userName, String password, String email) {
		super();
		this.rid = rid;
//		this.user = user;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
