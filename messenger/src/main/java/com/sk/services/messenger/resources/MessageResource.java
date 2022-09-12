package com.sk.services.messenger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {

	@GET
	@Produces(value = MediaType.TEXT_PLAIN)
	public String getMessage() {
		return "Hello World !";
	}

}
