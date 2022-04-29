package com.wipro.stall;

import java.util.Scanner;

public class StallMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stall stall = new Stall();
		System.out.println("Name");
		stall.setName(scanner.nextLine());
		System.out.println("Detail");
		stall.setName(scanner.nextLine());
		System.out.println("Stall Type");
		String type = scanner.nextLine();
		System.out.println("Square Feet");
		int feet = scanner.nextInt();
		System.out.println("Does the Stall have TV (yes or no)");
		double cost = 0.0;
		String choice = scanner.next();
		if (choice.equalsIgnoreCase("yes")) {
			System.out.println("Enter Number of TV");
			int noOfTv = scanner.nextInt();
			cost = stall.computeCost(type, feet, noOfTv);

		} else {
			cost = stall.computeCost(type, feet);
		}
		System.out.println("Total Cost " + cost);
	}
}
