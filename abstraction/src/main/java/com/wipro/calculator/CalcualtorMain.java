package com.wipro.calculator;

public class CalcualtorMain implements Calculator {

	public int addition(int x, int y) {
		return x + y;
	}

	public int subtraction(int x, int y) {
		return x - y;
	}

	public double multiplication(double x, double y) {
		return x * y;
	}

	public double division(int x, int y) {
		return x / y;
	}

	public static void main(String[] args) {

		CalcualtorMain calcualtor = new CalcualtorMain();

		System.out.println(calcualtor.addition(x, y));
		System.out.println(calcualtor.subtraction(x, y));
		System.out.println(calcualtor.multiplication(x, y));
		System.out.println(calcualtor.division(x, y));

	}

}
