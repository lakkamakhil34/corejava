package com.languagefundamentals_1.methods;

import java.util.Scanner;

//with return type+ no arguments
//create methods for get salary and get bonus from different methods,
//calculate these two values in main method.

public class TestMethodsDemo6 {
	
	Scanner sc=new Scanner(System.in);
	double getSalary() {
		double sal=0;
		System.out.println("Enter your salary:");
		sal=sc.nextDouble();
		return sal;
	}
	
	double getBonus() {
		double bonus=0;
		System.out.println("Bonus is:");
		bonus=sc.nextDouble();
		return bonus;
	}
	

	public static void main(String[] args) {
	
		System.out.println("main method started");
		TestMethodsDemo6 t= new TestMethodsDemo6();
		double sal=t.getSalary();
		double bonus=t.getBonus();
		
		System.out.println("Total Salary of the Employee:"+(sal+bonus));
		
		
		
	}

}
