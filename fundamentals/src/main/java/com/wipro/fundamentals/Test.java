package com.wipro.fundamentals;

import java.util.Scanner;

public class Test {

	// Variable - Instance Variable // Class / Static Variable // Local Variable
	public static void main(String[] xyz) {
		// Local Variable - Declared inside any method or block {}

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number");
		int numberOne = scan.nextInt();
		// % - Modulo Operator - Remainder
		// 10%4 -> Remainder 2
		if (numberOne % 2 == 0) {
			System.out.println(numberOne + " is Even");
		} else {
			System.out.println(numberOne + " is Odd");
		}
		System.out.println("-----------------------------");
		System.out.println("Enter Number 2");
		int numberTwo = scan.nextInt();
		// Relational Operator
		if (numberOne > numberTwo) {
			System.out.println(numberOne + " is Greater Than " + numberTwo);
		} else {
			System.out.println(numberTwo + " is Greater Than " + numberOne);
		}
		System.out.println("-----------------------------");
		char str = '2'; // ASCII Values(Decimal ) - > Binary numbers
		// Logical Operator
		if (str >= 'A' && str <= 'Z') { // 65>= 65 && 65<=90
			System.out.println("Upper Case");
		} else if (str >= 'a' && str <= 'z') {
			System.out.println("Lower Case");
		} else {
			System.out.println("Not a Charcter");
		}
        // Greatest Among three numbers
	}
}
