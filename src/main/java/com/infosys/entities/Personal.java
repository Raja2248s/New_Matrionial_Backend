package com.infosys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
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
	
//	@OneToOne
////	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="rid" )
////	@PrimaryKeyJoinColumn
////	@JsonIgnore
//	private Registration registration ;
	@Column(unique = true)
	private int rid;
	
public Personal(int personalId, int rid, String photograph, String bloodGroup, Integer age) {
	super();
	this.personalId = personalId;
	this.rid = rid;
	this.photograph = photograph;
	this.bloodGroup = bloodGroup;
	this.age = age;
}
public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}

	//	@Lob
	private String photograph;
	
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

	public Personal() {
		super();
	}


	public void setPersonalId(int personalId) {
		this.personalId = personalId;
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

	

	
}
