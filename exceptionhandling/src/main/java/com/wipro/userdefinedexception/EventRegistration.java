package com.wipro.userdefinedexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EventRegistration {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Age");
		int age = scanner.nextInt();
		try {
			if (age < 18) {
				InvalidAgeToRegisterException object = new InvalidAgeToRegisterException("Age Should be Greater than 18 to Register");
				throw object;
			} else {
				System.out.println("Registration Sucessfull");
			}
		} catch (InvalidAgeToRegisterException e) {
			System.out.println(e);
			System.out.println(e.getLocalizedMessage());
		}

	}

}
