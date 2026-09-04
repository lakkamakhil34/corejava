package com.oops.inheritance;



public class PersonalLoan extends LoanImpl {
	
	
	
	void getPersonalLoanDocInfo() {
		System.out.println("All the Personal Loan documents verified successfully !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Vcube Personal Loan Banking!!");
		
		PersonalLoan pl=new PersonalLoan();
		
		double salary=pl.getCustomerSalary();
		int age=pl.getCustomerAge();
		int cibil=pl.getCibilScore();
		
		if(salary >= 900000.00 && age >=26 && cibil<=900) {
			System.out.println("Basic information is validated check personal details");
			if(pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
				System.out.println("details are good and Loan got approved!!");
				System.out.println("Your Loan ROI is:"+pl.getLoanROI());
				pl.getPersonalLoanDocInfo();
			}else {
				System.out.println("Something went wrong!");
			}
		}else {
			System.out.println("You are not eligible for personal loan and your loan got rejected!");
		}
		
		
		
		System.out.println("main method ended");
		
	}

}
