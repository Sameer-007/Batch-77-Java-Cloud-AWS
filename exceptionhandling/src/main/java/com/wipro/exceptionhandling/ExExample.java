package com.wipro.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String aadhar = "12345678ABC";
		try {
			System.out.println("Enter the age");
			int age = scanner.nextInt();
			System.out.println("your age " + age);

			int aa = Integer.parseInt(aadhar);
			System.out.println("Your Aadhar " + aa);
    	}

		catch (InputMismatchException e) {
			System.out.println("Enter proper input - only numbers");
		} catch (NumberFormatException e) {
			System.out.println("String should contain only digits");
		} catch (Exception e) {
			System.out.println("SuperClass Exception - add it in last catch block");
		}

		finally {
			scanner.close();
		}

	}

}
