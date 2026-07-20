package com.languagefundamentals_1.methods;
import java.util.Scanner;

public class LoanInterest {
	
	double calculateInterest(double principal, double rate, double time) {
		double calInt=(principal*rate*time)/100;
		return calInt;
		
	}

	 void main(String[] args) {
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		//LoanInterest t=new LoanInterest();
		//t.calculateInterest(double,double,double);
		
		
		System.out.println("Enter principal Amount:");
		double principal=sc.nextDouble();
		System.out.println("Enter Interest:");
		double rate=sc.nextDouble();
	    System.out.println("Enter Time (in years):");
	    double time=sc.nextDouble();
	    
	   double simpleInterest=calculateInterest(principal,rate,time);
	   
	    System.out.println("Simple Interest:"+simpleInterest);
	    
	
	}

}
