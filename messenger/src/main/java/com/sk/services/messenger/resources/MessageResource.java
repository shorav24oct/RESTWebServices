package com.sk.services.messenger.resources;

import java.util.List;

import com.sk.services.messenger.model.Message;
import com.sk.services.messenger.service.MessageService;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/messages")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class MessageResource {

	MessageService service = new MessageService();

	@GET
	public List<Message> getMessages(@QueryParam("year") int year) {
		System.out.println(year);
		return service.getAllMessages();
	}

	@GET
	@Path("/{id}")
	public Message getMessage(@PathParam("id") long id) {
		return service.getMessage(id);
	}

	@POST
	public Message addMessage(Message message) {
		return service.addMessage(message);
	}

	@PUT
	public Message updateMessage(Message message) {
		return service.updateMessage(message);
	}

	@DELETE
	@Path("/{id}")
	public Message deleteMessage(@PathParam("id") long id) {
		return service.deleteMessage(id);
	}
	
	@Path("/{messageId}/comment")
	public CommentResource getCommentResource() {
		return new CommentResource();
	}

}
