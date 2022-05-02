package com.wipro.overide;

import java.util.Scanner;

public class ShapeMain {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Rectangle\n2.Circle");

		int choice = scanner.nextInt();
		if (choice == 1) {
			Rectangle rectangle = new Rectangle();
			System.out.println("Enter length");
			rectangle.setLength(scanner.nextInt());
			System.out.println("Enter Bredth");
			rectangle.setBredth(scanner.nextInt());
			System.out.println("Area of Rect " + rectangle.area());

		}
		if (choice == 2) {
			Circle circle = new Circle();
			System.out.println("Enter Radius");
			circle.setRadius(scanner.nextInt());
			System.out.println("Area of Circle " + circle.area());

		}
		// Connect @11.30pm

	}

}
