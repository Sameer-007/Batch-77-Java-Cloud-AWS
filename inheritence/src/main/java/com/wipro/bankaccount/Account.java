package com.wipro.bankaccount;

public class Account {

	protected int accNo;  // getAccNo
	protected String accType; // getAccType
	protected String bankName; // getBankName
	
	
	protected void displayAccountDetails() {
		System.out.println("Account Type " + getAccType());
		System.out.println("Account No " + getAccNo());
		System.out.println("Bank Name " + getBankName());
	}


	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public String getAccType() {
		return accType;
	}


	public void setAccType(String accType) {
		this.accType = accType;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	
	
	
	
}
