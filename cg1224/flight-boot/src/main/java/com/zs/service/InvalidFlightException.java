package com.zs.service;

public class InvalidFlightException extends Exception {

	public InvalidFlightException() {
	}

	public InvalidFlightException(String message) {
		super(message);
	}
}
