package com.wipro.customer;

public class Customer {
	// Instance Variable - Declare Inside class and outside all methods
	// State / Data / Members
	int id;
	String name;
	long phone;
	double salary;
	String city;

	// Display Customer Details (Behavior)
	// Instance method
	public void displayCustomer() {
		System.out.println("Name\t        " + name);
		System.out.println("Id " + id);
		System.out.println("Phone " + phone);
		System.out.println("Salary " + salary);
		System.out.println("City " + city);
	}

	public static void main(String[] args) {
		// Create Object for Customer Class
		Customer dheeraj = new Customer();
		dheeraj.id = 101;
		dheeraj.name = "Dheeraj";
		dheeraj.phone = 9876655252l;
		dheeraj.salary = 30000.78;
		dheeraj.city = "Chennai";

		dheeraj.displayCustomer();
		Customer customer2=new Customer();
		
	}

}
