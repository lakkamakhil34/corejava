package com.oops.abstraction;

public abstract class BankAccountAbs implements BankAccount {

	//instance variable
	int a=10;
	
	//static variable
	static String name="My-Banking";
	
	//constructor
	BankAccountAbs(){
		System.out.println("no-args constructor called");
	}
	
//abstract method from abstract class
		void hello() {
	     	System.out.println("Good morning have a nice day");
			}

	 //concrete method
		public void welcome() {
			System.out.println("Welcome to My-Banking");
				
		 }
		
		 //override method from interface
	@Override
	public void deposite(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkbalance() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void loaninfo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loanROI() {
		// TODO Auto-generated method stub
		
	}
	

}
