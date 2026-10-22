package com.oops.inheritance;

import java.util.Scanner;

public class LoanImpl implements Loan{
	
      static Scanner sc=new Scanner(System.in);
     
      @Override
	public boolean isPhoneValid() {
		System.out.println("Enter your mobile number:");
		String phone=sc.next();
		
		return phone.matches("[6-9]{1}[0-9]{9}");
	}
	
      @Override
	public boolean isAadharValid() {
		System.out.println("Enter your Aadhar number:");
		String aadhar=sc.next();
		
		return aadhar.matches("[1-9]{1}[0-9]{11}");
	}
      @Override
	public boolean isPanValid() {
		System.out.println("Enter PAN card details:");
		String pan=sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
      @Override
	public double getLoanROI() {
		double roi=9.5;
		int cibil=getCibilScore();
		if(cibil >=300 && cibil <=549) {
			System.out.println("Poor- High risk; loan application are likely to be rejected or approved at high interest rates");
			roi=roi+5.0;
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
	public int getCibilScore(){
		System.out.println("Enter your Cibil Score:");
		int cibil=sc.nextInt();
		return cibil;
	}
	public double getCustomerSalary() {
		System.out.println("Enter your Salary:");
		double salary=sc.nextDouble();
		return salary;
		
	}
	
	public int getCustomerAge() {
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		return age;
	}

	public static void main(String[] args) {
		

	}

}
