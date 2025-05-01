package com.zs.service;

public class InvalidProductException extends RuntimeException {

	public InvalidProductException() {
	}

	public InvalidProductException(String message) {
		super(message);
	}

}
