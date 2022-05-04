package com.wipro.exceptionhandling;

public class ExTypes {

	// Checked Exception - Checked at compile time - try catch

	// Unchecked Exception - checked at run time - logic error

	public static void main(String[] args) {
		ExTypes exTypes = null;
		int a = 100, b = 0;
		String[] lang = new String[] { "Java", "C#", "Python" };
		String comapny = "Wipro";
		System.out.println("----ArithmeticException----");
		try {
			int c = a / b;
			System.out.println("Result " + c);
		} catch (ArithmeticException ex) {
			ex.printStackTrace();
		}

		System.out.println("----ArrayIndexOutOfBoundException-----");
		try {
			System.out.println(lang[3]); // length 3 - Index 0 1 2
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("Check the array Index");
		}
		comapny = null;
		System.out.println("---NullPointerException ----");
		try {
			// boolean equals = comapny.equals("saas");
			exTypes.getClass();
			// System.out.println(equals);
		} catch (NullPointerException e) {
			System.out.println(e);
			System.out.println("check object");
		}

	}

}
