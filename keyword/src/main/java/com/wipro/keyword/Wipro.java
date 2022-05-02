package com.wipro.keyword;

public class Wipro {

	String company = "Wipro";
	String city;

	public Wipro(String company, String city) {
		super();
		this.company = company;
		this.city = city;
	}

	void display() {
		String company = "Stackroute";
		String city = "Bengaluru";
		System.out.println(company); // Stackroute
		System.out.println(city);
		// this keyword refer to current instance
		System.out.println(this.company); // Wipro
		System.out.println(this.city);
		
		//this()  -- Constructor Chaining

	}

	public static void main(String[] args) {

		Wipro wipro = new Wipro("Chennai", "Congnizant");

		wipro.display();

	}

}
