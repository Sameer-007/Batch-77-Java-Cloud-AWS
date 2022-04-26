package com.wipro.encapsulation;

public class Employee {
   // Access Modifiers - public private protected default
   // Encapsulation can be achieved using private - data hiding
	private int id;
	private String name; 
	private String aadhar;
	private long mobile;
	private String company;
    // Employee Has A Address
	private Address address; // houseNo streetName city pincode
	
    public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee() {
	
	}
    public Employee(int id, String name, String aadhar, long mobile, String company, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.aadhar = aadhar;
		this.mobile = mobile;
		this.company = company;
		this.address = address;
	}
	public void display() {
		System.out.println(id + "-" + name + "-" + aadhar + "-" + mobile + "-" + company);
		System.out.println(address.getHouseNo() + "--" + address.getStreetName() + "--" + address.getCity() +"-" + address.getPincode());
	}

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

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

}
