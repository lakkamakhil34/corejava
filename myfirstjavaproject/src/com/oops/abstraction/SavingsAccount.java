package com.oops.abstraction;

public class SavingsAccount extends BankAccountAbs {

	double balance=20000.00;
	
	
	@Override
	public void deposite(double amount) {
		hello();
		System.out.println("Your deposite amount is:"+amount);
		balance= balance+amount;
		checkbalance();
		
	}

	@Override
	public void withdraw(double amount) {
		hello();
		System.out.println("Your withdraw amount:"+amount);
		if(amount <= balance) {
			balance=balance-amount;
			checkbalance();
		}else {
			System.out.println("Insufficient funds");
		}
		checkbalance();
	}

	@Override
	public void checkbalance() {
		System.out.println("the current balance is: "+balance);
	
	}
	
	//abstract method from abstract class
	void hello() {
		System.out.println("Good morning have a nice day");
	}

	//concrete method
	public void welcome() {
		System.out.println("Welcome to My-Banking");
		
		
	}

	@Override
	public void loaninfo() {
		// TODO Auto-generated method stub
		
	}
	

}
