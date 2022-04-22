package com.wipro.arrayex;

import java.util.Scanner;

public class ProblemOne {

	private static Scanner scanner;

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		int sizeOfArray = scanner.nextInt();
		String[] city = new String[sizeOfArray];

		for (int i = 0; i < city.length; i++) {
			city[i] = scanner.next();
		}
         int min=city[0].length();
         String minLenCity="";
		// print all city
		for (String x : city) {
			
			if(min > x.length()) {
				min=x.length();
				minLenCity=x;
			}
			
			// print city with minimum length 
			System.out.println(x);
		}
		System.out.println("Minimum length " + min);
		System.out.println("Minimum City " + minLenCity);

	}

}
