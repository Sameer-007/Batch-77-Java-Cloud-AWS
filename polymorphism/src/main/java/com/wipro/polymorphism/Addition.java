package com.wipro.polymorphism;

public class Addition {

	// Same name / different action
	// Same Method name and number of parameters should be different
	// Number of parameters is same then datatype differs
	public int addition(int x, int y) { // 2 parameters
		return x + y;
	}

	public int addition(int x, int y, int z) { // 3 parameters
		return x + y + z;
	}

	public double addition(double x, int y) {
		return x + y;
	}

	public double addition(double x, double y) {
		return x * y;
	}
	


}
