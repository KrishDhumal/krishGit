package com.zs.service;

public class InvalidMovieException extends RuntimeException {

	public InvalidMovieException() {
	}

	public InvalidMovieException(String message) {
		super(message);
	}

}
