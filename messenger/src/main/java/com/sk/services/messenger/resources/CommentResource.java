package com.sk.services.messenger.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/")
public class CommentResource {

	@GET
	public String test() {
		return "new sub resource";
	}
	
	@GET
	@Path("{commentId}")
	public String test2(@PathParam("messageId") long messageId, @PathParam("commentId") long commentId) {
		return "new sub resource message ID: " + messageId + " and comment ID: " + commentId;
	}

}
