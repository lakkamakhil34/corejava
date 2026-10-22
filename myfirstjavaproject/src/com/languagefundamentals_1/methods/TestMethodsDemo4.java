package com.languagefundamentals_1.methods;

public class TestMethodsDemo4 {
	
	Double balance=10000.00;

	void main(String[] args) {
		System.out.println("****Welcome to Vcube Banking****");
		checkBalance();
		deposit(20000);
		withdraw(35000);
		
	}
	
	void checkBalance() {
		System.out.println("The current balance is:"+balance);
	}
	
	void deposit(double amount) {
		System.out.println("Deposit method called");
		balance= balance+amount;
		checkBalance();
	}
	
	void withdraw(double amount) {
		if(amount<=balance) {
			
		}else {
			System.err.println("Your transaction is cancelled. Due to insufficient funds");
		}
		balance=balance-amount;
		checkBalance();
		
	}

}
