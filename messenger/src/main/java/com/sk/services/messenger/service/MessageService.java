package com.sk.services.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sk.services.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		List<Message> messages = null;

		Message message1 = new Message(1L, "Hello World", "shorav", new Date());
		Message message2 = new Message(2L, "Good Morning India", "shorav", new Date());

		messages = new ArrayList<>();
		messages.add(message1);
		messages.add(message2);

		return messages;
	}

}
