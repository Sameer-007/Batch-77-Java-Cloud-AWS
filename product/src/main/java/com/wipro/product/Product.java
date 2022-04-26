package com.wipro.product;

public class Product {

	int id;
	String name;
	double price;
	int quantity;

	// No Argument Constructor
	public Product() {

	}

	// Parameterized Constructor
	public Product(int id, String name, double price, int quantity) {

		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	// Getter and Setter Methods
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	public void displayProductDetails() {
		System.out.println(" Id" +  getId());
    	System.out.println(" Name" +  getName());
    	System.out.println(" Price" +  getPrice());
    	System.out.println(" Quantity" + getQuantity());
	}

	
	
}
