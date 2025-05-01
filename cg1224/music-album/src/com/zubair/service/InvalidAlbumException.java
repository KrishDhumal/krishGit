package com.zubair.service;

public class InvalidAlbumException extends Exception {

	public InvalidAlbumException() {
	}

	public InvalidAlbumException(String message) {
		super(message);
	}
}
