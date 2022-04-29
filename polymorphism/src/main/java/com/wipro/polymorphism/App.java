package com.wipro.polymorphism;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Addition addition = new Addition();

		System.out.println(addition.addition(10, 20));
		System.out.println(addition.addition(10.23, 34));
		System.out.println(addition.addition(12.34, 45.67));
		System.out.println(addition.addition(1, 2, 3));

	}
}
