package com.wipro.overide;

public class Rectangle extends Shape {
	
	public int length;
	public int bredth;
	
	//Same name / same number of parameter/datatype / returntype
	// Same method signature both in super and sub class
	@Override // Information given to compiler - Override method from superclass
	public double area() {   //must override a superclass method
		return length *bredth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBredth() {
		return bredth;
	}

	public void setBredth(int bredth) {
		this.bredth = bredth;
	}

}
