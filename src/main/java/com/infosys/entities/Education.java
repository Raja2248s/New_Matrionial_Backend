package com.infosys.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int educationId;
	
	@Column(unique = true)
	private int rid;
	
	

	public Education() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String educationLevel;
	private String educationFiled;
	public int getEducationId() {
		return educationId;
	}
	
	public Education(int educationId, int rid, String educationLevel, String educationFiled) {
		super();
		this.educationId = educationId;
		this.rid = rid;
		this.educationLevel = educationLevel;
		this.educationFiled = educationFiled;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public void setEducationId(int educationId) {
		this.educationId = educationId;
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
	
	
	
}
