package com.sk.services.messenger.resources;

import java.util.List;

import com.sk.services.messenger.model.Message;
import com.sk.services.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	MessageService service = new MessageService();

	@GET
	@Produces(value = MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		return service.getAllMessages();
	}

}
