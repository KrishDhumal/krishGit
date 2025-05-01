package com.zs.service;

public class InvalidMemberException extends RuntimeException {

	public InvalidMemberException() {
	}

	public InvalidMemberException(String message) {
		super(message);
	}
	
}
