package com.languagefundamentals_1.methods;

public class BankAccount {
	
	//Method to display account details
	
	void displayAccount() {
		System.out.println("Account number:100261136312");
		System.out.println("Account Holder name:Dayakar");
		System.out.println("Account Type: Savings Account");
		System.out.println("Balance: 1,00,000");
		
	}

	public static void main(String[] args) {
		
	//create an object of bank account
		BankAccount t= new BankAccount();
		
		//calling the displayedAccount() method
		t.displayAccount();
		

	}

}
