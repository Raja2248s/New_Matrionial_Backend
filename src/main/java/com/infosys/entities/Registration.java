package com.infosys.entities;

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
	@OneToOne(mappedBy = "registration" , fetch = FetchType.EAGER)
	
    private User user;
	private String userName;
	private String password;
	
	@Column(unique = true)
	private String email;
	public Registration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Registration(int rid, User user, String userName, String password, String email) {
		super();
		this.rid = rid;
		this.user = user;
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
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
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
