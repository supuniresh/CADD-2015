package com.se.sampleApp.exception;

public class LoginFailedException extends Exception {

	String reason;

	public LoginFailedException(String reason) {
		super(reason);
		this.reason = reason;
	}

	public String getReason() {
		return this.reason;
	}

}
