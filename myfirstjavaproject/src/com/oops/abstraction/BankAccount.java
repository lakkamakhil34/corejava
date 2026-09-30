package com.oops.abstraction;

public interface BankAccount {

	public abstract void deposite(double amount);
	
	public abstract void withdraw(double amount);
	
	void checkbalance();
	
	void welcome();
	
	void loaninfo();
	
	void loanROI();
}
