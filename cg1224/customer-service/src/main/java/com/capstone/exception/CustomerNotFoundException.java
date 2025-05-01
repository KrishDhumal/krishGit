package com.capstone.exception;

public class CustomerNotFoundException extends RuntimeException {

	public CustomerNotFoundException() {
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}

}
