package com.infosys.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entities.Message;
import com.infosys.services.MessageService;

@RestController
public class MessageController {
	@Autowired
	MessageService service;
	
	@PostMapping("/message")
	public Message addmessage(@RequestBody Message registration) {
		return service.addmessage(registration);
	}
}
