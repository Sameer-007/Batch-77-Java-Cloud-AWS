package com.wipro.userdefinedexception;

public class InvalidAgeToRegisterException extends Exception {

	// User Defined Exception - Class should Extends Exception class
	// create constructor and pass message to super class (Exception)
	public InvalidAgeToRegisterException(String msg) {
		super(msg);
	}

}
