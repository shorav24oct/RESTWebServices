package com.sk.services.messenger.resources;

import java.net.URI;
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
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.UriInfo;

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
	public Response addMessage(Message message, @Context UriInfo uriInfo) {
		Message serviceMessage = service.addMessage(message);

		String newId = String.valueOf(serviceMessage.getMessageId());

		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();

		return Response.created(uri).entity(serviceMessage).build();
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
