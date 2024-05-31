package com.infosys.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int messageId;
	
	private int form;
	
	private int torid;
	
	private String message;

	private int rid ;
	
	public Message() {
		super();
	}
	
	public Message(int messageId, int rid ,  int form, int torid, String message) {
		super();
		this.messageId = messageId;
		this.rid = rid;
		this.form = form;
		this.torid = torid;
		this.message = message;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public int getForm() {
		return form;
	}

	public void setForm(int form) {
		this.form = form;
	}

	public int getTo() {
		return torid;
	}

	public void setTo(int to) {
		this.torid = to;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	

}
