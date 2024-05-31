package com.infosys.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.infosys.entities.Message;
import com.infosys.repositories.MessageRepository;
@Service
public class MessageService implements MessageServiceInterface {
	@Autowired
	MessageRepository repository;
	
	@Override
	public Message addmessage(Message id) {
		return repository.save(id);
	}
	
	 public Message addMessage(Message message) {
	        return repository.save(message);
	    }
	 
	 
	
}

