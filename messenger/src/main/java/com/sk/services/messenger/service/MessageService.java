package com.sk.services.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.sk.services.messenger.database.DatabaseClass;
import com.sk.services.messenger.model.Message;

public class MessageService {

	Map<Long, Message> messageMap = DatabaseClass.getMessages();

	public MessageService() {
		messageMap.put(1L, new Message(1L, "Hello World", "shorav"));
		messageMap.put(2L, new Message(2L, "Good Morning India", "shorav"));
	}

	public List<Message> getAllMessages() {
		return new ArrayList<Message>(messageMap.values());
	}

	public Message getMessage(long id) {
		return messageMap.get(id);
	}

	public Message addMessage(Message message) {
		message.setMessageId(messageMap.size() + 1);
		messageMap.put(message.getMessageId(), message);
		return message;
	}

	public Message updateMessage(Message message) {
		if (message.getMessageId() <= 0)
			return null;
		else
			messageMap.put(message.getMessageId(), message);
		return message;
	}

	public Message deleteMessage(long id) {
		return messageMap.remove(id);
	}

}
