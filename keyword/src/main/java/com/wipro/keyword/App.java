package com.wipro.keyword;

class A {
	String company="Wipro";
	public A() {
		super();
		System.out.println("A");
	}
	
	public void AA() {
		
	}
}

class B extends A { // A Super for B (sub)
	String company="Stackroute";
	public B() {
		super();
		System.out.println("B");
		System.out.println(super.company); // Wipro
		System.out.println(company); 
		super.AA();// Stackroute
	}
}

public class App extends B // B Super for App (sub)
{
	String company="NIIT";
	public App() {
		super(); // Super call must be the first statement in a constructor
		// Call the Parent constructor
		System.out.println("C");
		System.out.println(super.company); // Stackroute
		System.out.println(company); //  NIIT
		
	}
	public static void main(String[] args) {
		
		App app=new App(); //  object initialized - constructor will be called automatically // ABC
		
		B b=new B(); //AB 
		
		A c=new A(); //A
		
		// A B C
		
		
	}
}
