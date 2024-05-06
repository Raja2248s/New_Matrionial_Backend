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
	
	private String formUsername;
	
	private String toUsername;
	
	private String message;

	public Message() {
		super();
	}
	
	public Message(int messageId, String formUsername, String toUsername, String message) {
		super();
		this.messageId = messageId;
		this.formUsername = formUsername;
		this.toUsername = toUsername;
		this.message = message;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getFormUsername() {
		return formUsername;
	}

	public void setFormUsername(String formUsername) {
		this.formUsername = formUsername;
	}

	public String getToUsername() {
		return toUsername;
	}

	public void setToUsername(String toUsername) {
		this.toUsername = toUsername;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
