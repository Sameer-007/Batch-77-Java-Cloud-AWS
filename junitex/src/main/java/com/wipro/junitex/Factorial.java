package com.wipro.junitex;

public class Factorial {

	public int calculateFactorial(int no) {

		int fact = 1;
		if (no < 0) {
			return -1;
		}

		for (int i = 1; i <= no; i++) {
			fact = fact * i;
		}

		return fact;

	}

	
	public static void main(String[] args) {
		
		String str="sathish"; // jaVa
		
		
		str="Java programming";
		
		System.out.println(str);
		
		
	}
}
