package com.wipro.bankaccount;

import java.util.Scanner;

public class AccountMain {
   
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press\n1.Saving Account\n2.Current Account");
		int choice=scanner.nextInt();
        switch(choice) {
        case 1:
          	String  type=scanner.next();
        	int accno=scanner.nextInt();
        	String bank=scanner.next();
        	int min=scanner.nextInt();
        	
        	SavingAccount acc=new SavingAccount(type, accno, bank, min);
        	acc.displaySavingAccountDetails();
        	
        	SavingAccount savingAccount=new SavingAccount();
        	System.out.println(" Account Type");
        	savingAccount.setAccType(scanner.next());
        	System.out.println(" Account No");
        	savingAccount.setAccNo(scanner.nextInt());
        	System.out.println("Bank name ");
        	savingAccount.setBankName(scanner.next());
        	System.out.println("Minium Balance");
        	savingAccount.setMinBalanace(scanner.nextInt());
       	
        	savingAccount.displaySavingAccountDetails();
        	
        	break;
        	default:
        		System.out.println("Thank you");
        		break;
        }
		
	}
}
