package com.oops.abstraction;

public class TestBankAccount {

	public static void main(String[] args) {
		System.out.println("Welcome to My-Banking Savings Account");
		
//		Cannot instantiate the type BankAccount
//		BankAccount ba=new BankAccount();

//     Cannot instantiate the type BankAccountAbs(abstract class)
	//	BankAccountAbs bb=new BankAccountAbs();
		
		SavingsAccount sa=new SavingsAccount();
		sa.deposite(30000.00);
		sa.withdraw(10000.00);
//we can use parent class functionalities by using child object with reference is the 
	//process of upcasting	
		sa.welcome();
		
		
		
	}

}
