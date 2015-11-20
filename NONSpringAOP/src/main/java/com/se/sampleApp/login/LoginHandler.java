/**
 * 
 */
package com.se.sampleApp.login;

import com.se.sampleApp.exception.LoginFailedException;

/**
 * @author samitha
 * 
 */
public class LoginHandler {

	private String username = "Samitha";
	private String password = "Samitha123";

	public boolean login(String username, String password)
			throws LoginFailedException {
		if (username == null || username.trim().length() == 0) {
			throw new LoginFailedException("Empty username");
		}
		if (password == null || password.trim().length() == 0) {
			throw new LoginFailedException("Empty password");
		}

		if (this.username != username) {
			return false;
		}

		if (this.username != username || this.password != password) {
			return false;
		}

		if (this.username == username && this.password == password) {
			return true;
		}

		return false;
	}

	public void logout() {
		System.out.println("Logged out");

	}
}
