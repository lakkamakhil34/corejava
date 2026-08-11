package com.languagefundamentals_1.constructors;

public class BankAccountManagement {

	String accountholder;
	long accountnumb;
	double balance;
	
	BankAccountManagement(){
		this("unknown");
		
	}
	
	BankAccountManagement(String accountholder){
		this(accountholder,0);
		
	}
	BankAccountManagement(String accountholder,long accountnumb){
		this(accountholder,accountnumb,0.00);
		
	}
	
	
   BankAccountManagement(String accountholder, long accountnumb, double balance) {
		this.accountholder = accountholder;
		this.accountnumb = accountnumb;
		this.balance = balance;
		
	}

  void display() {
	  System.out.println("***************************************");
	  System.out.println("Account Holder Name:"+accountholder);
	  System.out.println("A/c number:"+accountnumb);
	  System.out.println("A/c Balance:"+balance);
	  System.out.println("*****************************************");
  }
  
   
	public static void main(String[] args) {
		System.out.println("main method called");

		BankAccountManagement b=new BankAccountManagement();
		BankAccountManagement b1=new BankAccountManagement("krishna");
		BankAccountManagement b2=new BankAccountManagement("krishna",98765432);
		BankAccountManagement b3=new BankAccountManagement("krishna",98765432,5000.00);

		
	
		b.display();
		b1.display();
		b2.display();
		b3.display();
		
		System.out.println("main method ended");
	}

}
