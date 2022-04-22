package com.wipro.arrayex;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// Single Dimensional Array - used to store the elements in continuous memory
		// location
		// Declare Array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = scanner.nextInt();
		int[] marks = new int[size]; // Variable must provide with array size
		// Read the Input
		for (int i = 0; i < size; i++) {
			System.out.println("marks[" + i + "]");
			marks[i] = scanner.nextInt();
		}
		// Length 6
		// index 0 - length-1(6-1 => 5)
		System.out.println("Length of Array " + marks.length);
		// Print all elements
		System.out.println("---------------------");
		for (int i = 0; i <= marks.length - 1; i++) { // 6<=6
			System.out.println(marks[i]);
		}

		System.out.println("--------------------");

		// System.out.println(marks[0]); // index : 0 1 2 3 4 5
		// System.out.println(marks[6]); // Index out of bound exceptions

		// sum of array elements sum=marks[0] + marks[1] + marks[3] +
		int sum = 0;
		for (int i = 0; i < marks.length; i++) {
			sum = sum + marks[i];
		}
		System.out.println("Total " + sum + "\n" + "Average " + (sum / marks.length));

		// sum of even numbers in array
		int evenSum = 0, indexEven = 0;
		for (int i = 0; i < marks.length; i++) {
			if (marks[i] % 2 == 0) {
				evenSum = evenSum + marks[i];
			}
			if (i % 2 == 0) {
				indexEven = indexEven + marks[i];
			}
		}

		System.out.println("Sum of Even " + evenSum);
		System.out.println("Sum of numbers whose index is even " + indexEven);
		System.out.println("----------------------");
		// odd
		// maximum minimum element in array
		int min = marks[0];
		int max = marks[0];

		for (int i = 1; i < marks.length; i++) {
			if (min > marks[i]) {
				min = marks[i];	
			}
			if (max < marks[i]) {
				max = marks[i];
			}
		}
		System.out.println("Minimum Marks " + min);
		System.out.println("Maximum Marks " + max);

		// Search an element in an array - Linear Search
		System.out.println("Enter the Element to Search");
		boolean flag = false;
		int key = scanner.nextInt(); // 10 20 30
		for (int i = 0; i < marks.length; i++) {
			if (key == marks[i]) { // 30 == marks[2] == 30
				flag = true; // flag=true
				break;
			}
		}
		if (flag) {
			System.out.println(key + " is found");
		} else {
			System.out.println(key + " is not found");
		}

		System.out.println("---- Sorting An Array Bubble Sort -------");

		for (int i = 0; i < marks.length-1; i++) {
			for (int j = 0; j < marks.length-1; j++) {
				if (marks[j] < marks[j + 1]) {  // a[0]>a[1]
					int temp = marks[j];        // temp=a[0]
					marks[j] = marks[j + 1];    // a[0] =a[1]
					marks[j + 1] = temp;        // a[1] =temp
				}
			}
		}
		// Sorted Array
		for (int i = 0; i < marks.length; i++) {
			System.out.println(marks[i]);
		}
		
		
		// remove duplicates in an array
		// 
		// i=0; i=i+2
		// add consective numbers 1 2 3 4 5 6  =>  sum =a[i] + a[i+1] =>  a[0] + a[1]
		// a[2]+a[3]
		
		
		
		
		
		
		
		

	}
}
