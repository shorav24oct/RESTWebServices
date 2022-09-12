package com.sk.services.messenger.resources;

import java.util.List;

import com.sk.services.messenger.model.Customer;
import com.sk.services.messenger.model.Message;
import com.sk.services.messenger.service.MessageService;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/resources")
public class MessageResource {

	MessageService service = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/messages")
	public List<Message> getMessages() {
		return service.getAllMessages();
	}

	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/customer")
	public Customer getCustomerInXML() {

		Customer customer = new Customer();
		customer.setName("shorav");
		customer.setPin(281001);

		return customer;

	}

}
