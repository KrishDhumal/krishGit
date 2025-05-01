package com.capstone.exception;

public class ProductAlreadyExistException extends RuntimeException {

	public ProductAlreadyExistException() {
	}

	public ProductAlreadyExistException(String message) {
		super(message);
	}
}
