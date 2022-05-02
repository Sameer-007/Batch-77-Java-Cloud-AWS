package com.wipro.keyword;

// cannot inherit the final class
// Immutable class -  declare with keyword final
final class NIIT {
	// final method prevents method overriding
	final public void listOfCourses() {
		System.out.println("ALL");
	}
}

public class Stackroute  extends NIIT {
	
	@Override
	public void listOfCourses() {   // Cannot override the final method
		System.out.println("MNC");
	}
	
	public static void main(String[] args) {
		
		final String company="IBM";
		
		company="Zoho"; // The final local variable  cannot be assigned / changed 
		
		System.out.println(company);
		
		
	}

}
