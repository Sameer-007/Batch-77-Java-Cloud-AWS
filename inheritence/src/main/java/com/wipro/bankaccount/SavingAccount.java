package com.wipro.bankaccount;

public class SavingAccount extends Account {

	private int minBalanace;
	
	public SavingAccount() {
		
	}
	public SavingAccount(String type,int accno,
			String bank,int balance) {
		this.accNo=accno;
		this.accType=type;
		this.bankName=bank;
		this.minBalanace=balance;
	}
	
	
	public void displaySavingAccountDetails() {
		displayAccountDetails();
		System.out.println("Minimum Balance " 
		      + getMinBalanace());
	}

	public int getMinBalanace() {
		return minBalanace;
	}

	public void setMinBalanace(int minBalanace) {
		this.minBalanace = minBalanace;
	}
	
	
}

