package com.wipro.inheritence;

public class College {

	protected int colCode;
	protected String colName;
	protected String address;
	protected int contactNo;
	protected String email;

	protected void showDetails() {
		System.out.println("College Details");
		System.out.println(getColCode() + "--" + getColName() + "--" + getAddress() + "--" + getContactNo());
	}

	public int getColCode() {
		return colCode;
	}

	public void setColCode(int colCode) {
		this.colCode = colCode;
	}

	public String getColName() {
		return colName;
	}

	public void setColName(String colName) {
		this.colName = colName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getContactNo() {
		return contactNo;
	}

	public void setContactNo(int contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
