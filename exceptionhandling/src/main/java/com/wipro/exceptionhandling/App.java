package com.wipro.exceptionhandling;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in);
		int a = 100, b = 0;
		System.out.println("Before Try Catch");
		
		
		try {
			int c = a / b; // 100/0
			System.out.println("Result " + c);
		} catch (Exception ex) {
			System.out.println(ex);
			System.out.println(ex.getClass());
			System.out.println(ex.getMessage());
			System.out.println("Divide by zero is not possible");

		} finally {
			System.out.println("Finally block will be executed always");
     		System.out.print("Release Resources");
			scanner.close();
		}
		System.out.println("After tr");
		System.out.println("Exception - Unwanted event that disrupts the flow of program execution");

	}
}
