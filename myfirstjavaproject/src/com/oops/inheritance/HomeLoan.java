package com.oops.inheritance;

public class HomeLoan extends LoanImpl {
	

	
	@Override
	public double getLoanROI() {
		double roi=7.5;
		int cibil=getCibilScore();
		if(cibil >=300 && cibil <=549) {
			System.out.println("Poor- High risk; loan application are likely to be rejected or approved at high interest rates");
			roi=roi+4.0;
		}else if(cibil >=550 && cibil <=699) {
			System.out.println("Fair- Moderate risk;may face limitations in credit approval");
			roi=roi+3.0;
		}else if(cibil >=700 && cibil <=749) {
			System.out.println("Good- Low risk:Better chances of loan approval with favorable terms ");
			roi=roi+1.5;
		}else if(cibil >=750 && cibil <=900) {
			System.out.println("Excellent-Very low risk;Highest likelihood of approval and access of low interest rates");
			roi=roi+0.5;
		}else{
			System.out.println("Invalid cibil information!! Can you connect with Relationship Manager of your Bank");
		}
		return roi;
	}
	
	
	void getHomeLoanDocInfo() {
		System.out.println("All the Home Loan documents verified successfully !!");
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		System.out.println("Welcome to Vcube Home Loan Banking!!");
		
		HomeLoan hl=new HomeLoan();
		
		double salary=hl.getCustomerSalary();
		int age=hl.getCustomerAge();
		int cibil=hl.getCibilScore();
		
		if(salary >= 800000.00 && age >=25 && cibil<=900) {
			System.out.println("Basic information is validated check personal details");
			if(hl.isPhoneValid() && hl.isAadharValid() && hl.isPanValid()) {
				System.out.println("details are good and Loan got approved!!");
				System.out.println("Your Loan ROI is:"+hl.getLoanROI());
				hl.getHomeLoanDocInfo();
			}else {
				System.out.println("Something went wrong!");
			}
		}else {
			System.out.println("You are not eligible for personal loan and your loan got rejected!");
		}
		
		
		
		System.out.println("main method ended");
		
		
	}

}
