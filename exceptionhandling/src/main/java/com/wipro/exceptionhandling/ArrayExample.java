package com.wipro.exceptionhandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayExample {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Size of an array");
		// Unhandled exception type IOException
		try {
			int size = Integer.parseInt(reader.readLine());
			String[] marks = new String[size];
			for (int i = 0; i < marks.length; i++) {
				System.out.println("Enter marks " + (i + 1));
				marks[i] = reader.readLine();
			}
			int sum = 0;
			for (String string : marks) {
				sum = sum + Integer.parseInt(string);
			}
			System.out.println("Total Marks " + sum);
		} catch (IOException e) {
			System.out.println("Device Not ready" + e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
    		System.out.println("Enter only digits");
		}finally {
			try {
				reader.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} // Take a Break  @12.00

	}

}
