package com.sk.services.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.sk.services.messenger.model.Message;

public class MessageService {

	public List<Message> getAllMessages() {
		Message message1 = new Message(1L, "Hello World", "shorav");
		Message message2 = new Message(2L, "Good Morning India", "shorav");

		List<Message> list = new ArrayList<>();
		list.add(message1);
		list.add(message2);

		return list;
	}

}
