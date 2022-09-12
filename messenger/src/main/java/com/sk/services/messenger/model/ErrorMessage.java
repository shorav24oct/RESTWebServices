package com.sk.services.messenger.model;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ErrorMessage {

	private int statusCode;
	private String errorName;
	private String description;

	public ErrorMessage() {

	}

	public ErrorMessage(int statusCode, String errorName, String description) {
		this.statusCode = statusCode;
		this.errorName = errorName;
		this.description = description;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorName() {
		return errorName;
	}

	public void setErrorName(String errorName) {
		this.errorName = errorName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
